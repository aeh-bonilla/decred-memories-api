package com.decred.memories.service.impl;

import java.text.MessageFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.decred.memories.service.CoinMarketCapService;
import decred.memories.payload.response.CoinMarketCapLastPricesResponse;
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

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("X-CMC_PRO_API_KEY", cmcApiKey);
		
		headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.set("x-api-key", cmcApiKey);
	    
	    HttpEntity<?> request = new HttpEntity<String>("", headers);

		ResponseEntity<CoinMarketCapLastPricesResponse> responseEntity = restTemplate.exchange(
				MessageFormat.format(cmcApiUrl, 1, 100, "USD"), HttpMethod.GET, request,CoinMarketCapLastPricesResponse.class);
		
		return responseEntity.getBody();
		
	}
}
