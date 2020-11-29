package com.decred.memories.service.impl;

import java.util.List;
import java.text.MessageFormat;

import com.decred.memories.payload.response.NewsResponse;
import com.decred.memories.service.NewsService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class NewsServiceImpl implements NewsService{
	
    @Autowired
    private ObjectMapper objectMapper;
    
    @Value("${decred.memories.newsapi.api.key}")
    private String newsApiKey;
    
    @Value("${decred.memories.newsapi.api.news.url}")
    private String newsApiUrl;

	public NewsResponse retrieveNewsByDatePeriod(String startingDate, String endingDate){
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.set("x-api-key", newsApiKey);
	    
	    HttpEntity<?> request = new HttpEntity<String>("", headers);
		
		String newsUrl = MessageFormat.format(newsApiUrl,startingDate, endingDate);
		ResponseEntity<NewsResponse> responseEntity = restTemplate.exchange(newsUrl, HttpMethod.GET, request, NewsResponse.class);
		
		return responseEntity.getBody();
	}
}
