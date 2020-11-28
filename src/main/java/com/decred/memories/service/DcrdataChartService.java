package com.decred.memories.service;

import java.util.List;
import decred.memories.payload.response.DecredMemoriesPriceResponse;

public interface DcrdataChartService {
	
   public List<DecredMemoriesPriceResponse>  getTicketPrices();
   
}
