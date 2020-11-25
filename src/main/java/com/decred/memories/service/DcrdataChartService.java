package com.decred.memories.service;

import java.util.List;

import com.google.gson.JsonObject;

import decred.memories.payload.response.DecredMemoriesPriceResponse;
import decred.memories.payload.response.TicketPriceChartResponse;

public interface DcrdataChartService {
	
	public List<DecredMemoriesPriceResponse>  getTicketPrices();
}
