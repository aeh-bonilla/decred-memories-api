package com.decred.memories.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decred.memories.payload.response.CoinMarketCapLastPricesResponse;
import com.decred.memories.service.CoinMarketCapService;
import org.springframework.beans.factory.annotation.Autowired;

/**
*
* @author alain.bonilla
*/

@RequestMapping("/api/v1")
@RestController
@Api(value="Symbol price service", description="Services to retrieve symbol's prices from external API's resources")
public class SymbolPriceController {

	@Autowired
	private CoinMarketCapService coinMarketCapService;
	
    @ApiOperation(value = "Service to retrieve symbol's top 100 latests prices", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Request Successfully"),
            @ApiResponse(code = 400, message = "Generic error to inform problems with the sended information"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Exception without treatment")
    })
    @GetMapping(value = "/latestprices")
    public ResponseEntity<CoinMarketCapLastPricesResponse> retrieveLatestPrices(){
    	return ResponseEntity.ok().body(this.coinMarketCapService.retirveLatestPrices());	
    }
}
