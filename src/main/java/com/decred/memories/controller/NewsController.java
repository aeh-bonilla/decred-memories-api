package com.decred.memories.controller;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.decred.memories.payload.response.NewsResponse;
import com.decred.memories.service.NewsService;

/**
*
* @author alain.bonilla
*/

@RequestMapping("/api/v1")
@RestController
@Api(value="News services", description="Services to retrieve news from external API's resources")
public class NewsController {

	@Autowired
	private NewsService newsService;
	
    @ApiOperation(value = "Service retrieve news by date period", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Request Successfully"),
            @ApiResponse(code = 400, message = "Generic error to inform problems with the sended information"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Exception without treatment")
    })
    @GetMapping(value = "/news")
    public ResponseEntity<NewsResponse>  retrieveNews(@RequestParam(name = "startingDate", required = false) String startingDate,
    		@RequestParam(name = "endingDate", required = false) String endingDate){
       return ResponseEntity.ok().body(this.newsService.retrieveNewsByDatePeriod(startingDate, endingDate));
    } 	
}
