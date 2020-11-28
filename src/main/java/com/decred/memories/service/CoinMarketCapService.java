package com.decred.memories.service;

import decred.memories.payload.response.CoinMarketCapLastPricesResponse;

public interface CoinMarketCapService {

	public CoinMarketCapLastPricesResponse retirveLatestPrices();
}
