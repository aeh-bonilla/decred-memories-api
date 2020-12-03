package com.decred.memories.service.impl;

import com.decred.memories.payload.response.AgendasResponse;
import com.decred.memories.payload.response.DecredMemoriesAgendaResponse;
import com.decred.memories.service.DcrdataAgendaService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import org.joda.time.DateTimeComparator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

@Service
public class DcrdataAgendaServiceImpl implements DcrdataAgendaService {
	
    @Autowired
    private ObjectMapper objectMapper;
    
    @Value("${dcrdata.agendas.url}")
    private String agendaUrl;
	
	public List<DecredMemoriesAgendaResponse> getAgendaByDate() throws ParseException {
		
	   RestTemplate restTemplate = new RestTemplate();
	   
	   /*Date date= new SimpleDateFormat("yyyy-MM-dd").parse(inputDate);*/
	   
	   List<DecredMemoriesAgendaResponse> decredMemoriesAgendaResponseList = null;
	   ResponseEntity<AgendasResponse[]> responseEntity = restTemplate.getForEntity(agendaUrl, AgendasResponse[].class);
	   
	   if(responseEntity.getBody() != null) {

		   decredMemoriesAgendaResponseList = new ArrayList<DecredMemoriesAgendaResponse>();
		   
		   List<AgendasResponse> response = Arrays.asList(responseEntity.getBody());
		   Integer size = response.size();
		   
		   for(int i = 0; i < size; i++) {
			   String start = response.get(i).getStarttime();
			   String expire = response.get(i).getExpiretime();
//
//				if (dateCompare(start,date) || dateCompare(expire,date)) {
					DecredMemoriesAgendaResponse decredMemoriesAgendaResponse = new DecredMemoriesAgendaResponse(response.get(i).getName(),
							response.get(i).getDescription(),response.get(i).getStatus(),start,expire);

					decredMemoriesAgendaResponseList.add(decredMemoriesAgendaResponse);
//				}
		   }
	   }
	
	   return decredMemoriesAgendaResponseList;
	}

	private boolean dateCompare(Date dateOne, Date dateTwo) {
		DateTimeComparator dateTimeComparator = DateTimeComparator.getDateOnlyInstance();
		return dateTimeComparator.compare(dateOne, dateTwo) == 0;
	}
}