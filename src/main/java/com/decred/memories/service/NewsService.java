package com.decred.memories.service;

import java.util.List;

import com.decred.memories.payload.response.NewsResponse;

public interface NewsService {
	public NewsResponse retrieveNewsByDatePeriod(String startingDate, String endingDate);
}
