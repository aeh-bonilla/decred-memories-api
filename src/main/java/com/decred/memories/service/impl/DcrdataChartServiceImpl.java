package com.decred.memories.service.impl;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.decred.memories.service.DcrdataChartService;
import com.fasterxml.jackson.databind.ObjectMapper;

import decred.memories.payload.response.DecredMemoriesPriceResponse;
import decred.memories.payload.response.TicketPriceChartResponse;

@Service
public class DcrdataChartServiceImpl implements DcrdataChartService {
	
    @Autowired
    private ObjectMapper objectMapper;
    
    @Value("${dcrdata.chart.ticketprice.url}")
    private String ticketPriceUrl;
	
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
			   
			  DecredMemoriesPriceResponse decredMemoriesPriceResponse = new DecredMemoriesPriceResponse(response.getCount().get(i),
		    		  response.getPrice().get(i),response.getT().get(i),strDate, 0);
		      
			  decredMemoriesPriceResponseList.add(decredMemoriesPriceResponse);
		   }
	   }
	
	   return decredMemoriesPriceResponseList;
	}
}
