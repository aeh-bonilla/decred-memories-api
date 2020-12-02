package com.decred.memories.controller;

import java.text.ParseException;
import java.util.List;
import com.decred.memories.service.DcrdataAgendaService;
import decred.memories.payload.response.DecredMemoriesAgendaResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
*
* @author ingridsophiac
*/

@RequestMapping("/api/v1")
@RestController
@Api(value="dcrdata agendas services", description="Services to retrieve data from dcrdata agendas")
public class DcrdataAgendasController {

	@Autowired
	private DcrdataAgendaService dcrdataAgendaService;
	
    @ApiOperation(value = "Service create user", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Request Successfully"),
            @ApiResponse(code = 400, message = "Generic error to inform problems with the sended information"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Exception without treatment")
    })
    @GetMapping(value = "/agenda/{date}")
    public ResponseEntity<List<DecredMemoriesAgendaResponse>>  getAgendaByDate(@PathVariable String date) throws ParseException {
      return ResponseEntity.ok().body(this.dcrdataAgendaService.getAgendaByDate(date));
    } 
}
