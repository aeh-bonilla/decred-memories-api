package com.decred.memories.service.impl;

import java.text.MessageFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.decred.memories.payload.response.CoinMarketCapLastPricesResponse;
import com.decred.memories.service.CoinMarketCapService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CoinMarketCapServiceImpl implements CoinMarketCapService {

    @Autowired
    private ObjectMapper objectMapper;
    
    @Value("${decred.memories.cmc.api.key}")
    private String cmcApiKey;
    
    @Value("${decred.memories.cmc.api.prices.url}")
    private String cmcApiUrl;
	
	public CoinMarketCapLastPricesResponse retirveLatestPrices() {

		CoinMarketCapLastPricesResponse coinMarketCapLastPricesResponse = null;
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("X-CMC_PRO_API_KEY", cmcApiKey);
		
	    HttpEntity<?> request = new HttpEntity<String>("", headers);

		ResponseEntity<String> responseEntity = restTemplate.exchange(
				MessageFormat.format(cmcApiUrl, 1, 100, "USD"), HttpMethod.GET, request, String.class);
		
		try {
			coinMarketCapLastPricesResponse = this.objectMapper.readValue(responseEntity.getBody(), CoinMarketCapLastPricesResponse.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return coinMarketCapLastPricesResponse;
		
	}
}
