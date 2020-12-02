package com.decred.memories.controller;

import java.util.Map;
import java.util.Date;
import java.util.HashMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.decred.memories.service.CommonService;
import com.decred.memories.util.FormatUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.decred.memories.exception.InternalServerErrorException;

/**
*
* @author alain.bonilla
*/

@RequestMapping("/api/v1")
@RestController
@Api(value="Decred memories common services", description="Services set up Decred memories app")
public class CommonServiceController {

	@Autowired
	private CommonService commonService;
	
    @ApiOperation(value = "Service initialize decred memories events", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Request Successfully"),
            @ApiResponse(code = 400, message = "Generic error to inform problems with the sended information"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Exception without treatment")
    })
    @PostMapping(value = "/events")
    public ResponseEntity<Map<String, Integer>> initializeEvents(@RequestParam(name = "strStartDate", required = true) String strStartDate,
    		@RequestParam(name = "strEndDate", required = false) String strEndDate){
    
    	Map<String, Integer> mapResponse = new HashMap<String, Integer>();
    	
    	Date startDate = FormatUtil.getDateFromString(FormatUtil.HYPHEN_YYYY_MM_DD_DATE_FORMAT, strStartDate);
    	Date endDate = FormatUtil.getDateFromString(FormatUtil.HYPHEN_YYYY_MM_DD_DATE_FORMAT, strEndDate);
    	
    	Integer generatedEvents = this.commonService.initializeDecredMemoriesEvents(startDate, endDate);
    	
    	if(generatedEvents != null) {
    	   mapResponse.put("generatedEvents", generatedEvents);
    	}else {
    		throw new InternalServerErrorException("There was an unexpected error trying to initialize decred memories events");
    	}
    	
    	return ResponseEntity.ok().body(mapResponse);
    }
}
