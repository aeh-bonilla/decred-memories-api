package decred.memories.payload.response;

import java.util.List;

public class CoinMarketCapLastPricesResponse {

	private CoinMarketCapStatusResponse status;
	private List<CoinMarketCapDataResponse> data;
	
	public CoinMarketCapLastPricesResponse() {}

	public CoinMarketCapStatusResponse getStatus() {
		return status;
	}

	public void setStatus(CoinMarketCapStatusResponse status) {
		this.status = status;
	}

	public List<CoinMarketCapDataResponse> getData() {
		return data;
	}

	public void setData(List<CoinMarketCapDataResponse> data) {
		this.data = data;
	}
}
