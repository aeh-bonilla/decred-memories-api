package com.decred.memories.service;

import java.util.List;

import com.decred.memories.payload.response.DecredMemoriesPriceResponse;

public interface DcrdataChartService {
	
   public List<DecredMemoriesPriceResponse>  getTicketPrices();
   
   public List<DecredMemoriesPriceResponse>  getTicketPricesByPeriod(String startingDate, String endingDate);
}
