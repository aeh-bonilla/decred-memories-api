package com.decred.memories.service.impl;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.decred.memories.payload.response.DecredMemoriesPriceResponse;
import com.decred.memories.payload.response.TicketPriceChartResponse;
import com.decred.memories.service.DcrdataChartService;
import com.decred.memories.util.FormatUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DcrdataChartServiceImpl implements DcrdataChartService {
	
    @Autowired
    private ObjectMapper objectMapper;
    
    @Value("${dcrdata.chart.ticketprice.url}")
    private String ticketPriceUrl;
    
    private static final Double DCR_ATOMS = 0.00000001;
	
	public List<DecredMemoriesPriceResponse> getTicketPrices(){
		
	   RestTemplate restTemplate = new RestTemplate();
	   List<DecredMemoriesPriceResponse> decredMemoriesPriceResponseList = null;
	   ResponseEntity<TicketPriceChartResponse> responseEntity = restTemplate.getForEntity(ticketPriceUrl, TicketPriceChartResponse.class);
	   
	   if(responseEntity.getBody() != null) {
	      
		   decredMemoriesPriceResponseList = new ArrayList<DecredMemoriesPriceResponse>();
		   
		   TicketPriceChartResponse response = responseEntity.getBody();
		   Integer size = response.getT().size();
		   
		   for(int i = 0; i < size; i++) { 
		      
			  Date transactionDate = null;
			  String strDate = null; 
			  
			  if(response.getT().get(i)!=null) {
				  transactionDate = new Date(response.getT().get(i) * 1000);  
		      }
			  
			  if(transactionDate!=null) {
				  strDate = new SimpleDateFormat("yyyy-MM-dd").format(transactionDate);  
			  }
			  
			  BigDecimal ticketPriceInDcr = BigDecimal.ZERO;
			  
			  if(response.getPrice().get(i) != null) {
				 
				 MathContext m = new MathContext(4);
			     ticketPriceInDcr = response.getPrice().get(i).multiply(new BigDecimal(this.DCR_ATOMS));  
			     ticketPriceInDcr = ticketPriceInDcr.round(m);
			  }
			  
			  DecredMemoriesPriceResponse decredMemoriesPriceResponse = new DecredMemoriesPriceResponse(response.getCount().get(i),
		    		  response.getPrice().get(i), ticketPriceInDcr, response.getT().get(i),strDate, 0);
		      
			  decredMemoriesPriceResponseList.add(decredMemoriesPriceResponse);
		   }
	   }
	
	   return decredMemoriesPriceResponseList;
	}
	
	public List<DecredMemoriesPriceResponse>  getTicketPricesByPeriod(String startingDate, String endingDate){
	
		List<DecredMemoriesPriceResponse> ticketPrices = this.getTicketPrices();
		List<DecredMemoriesPriceResponse> filteredTicketPrices = null;
		
    	Date startDate = FormatUtil.getDateFromString(FormatUtil.HYPHEN_YYYY_MM_DD_DATE_FORMAT, startingDate);
    	Date endDate = FormatUtil.getDateFromString(FormatUtil.HYPHEN_YYYY_MM_DD_DATE_FORMAT, endingDate);
		
		if(ticketPrices != null &&
		      !ticketPrices.isEmpty()) {
			
			filteredTicketPrices = new ArrayList<DecredMemoriesPriceResponse>();
			
			for(DecredMemoriesPriceResponse ticketPrice : ticketPrices) {
				
			   Date transsactionDate = new Date(ticketPrice.getTimeInSeconds()* 1000);
			
			   if(transsactionDate.compareTo(startDate) >= 0 &&
					   transsactionDate.compareTo(endDate) <=0) {
				   filteredTicketPrices.add(ticketPrice);
			   }
			}
		}
		
		return filteredTicketPrices;
	}
}
