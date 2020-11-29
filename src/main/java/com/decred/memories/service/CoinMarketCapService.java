package com.decred.memories.service;

import com.decred.memories.payload.response.CoinMarketCapLastPricesResponse;

public interface CoinMarketCapService {

	public CoinMarketCapLastPricesResponse retirveLatestPrices();
}
