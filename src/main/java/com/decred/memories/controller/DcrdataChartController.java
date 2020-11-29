package com.decred.memories.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.decred.memories.payload.response.DecredMemoriesPriceResponse;
import com.decred.memories.service.DcrdataChartService;

/**
*
* @author alain.bonilla
*/

@RequestMapping("/api/v1")
@RestController
@Api(value="dcrdata chart services", description="Services to retrieve data from dcrdata chars")
public class DcrdataChartController {

	@Autowired
	private DcrdataChartService dcrdataChartService;
	
    @ApiOperation(value = "Service create user", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Request Successfully"),
            @ApiResponse(code = 400, message = "Generic error to inform problems with the sended information"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Exception without treatment")
    })
    @GetMapping(value = "/ticketprice/full")
    public ResponseEntity<List<DecredMemoriesPriceResponse> >  retireveTicketPrices(){
      return ResponseEntity.ok().body(this.dcrdataChartService.getTicketPrices());
    } 
}
