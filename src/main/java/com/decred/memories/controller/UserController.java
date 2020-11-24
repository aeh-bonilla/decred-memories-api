package com.decred.memories.controller;

import java.util.HashMap;
import java.util.Map;
import com.decred.memories.dto.UserCoreInfoRequestDto;
import com.decred.memories.dto.UserTokenDto;
import com.decred.memories.service.AuthenticationService;
import com.decred.memories.service.UserService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 *
 * @author alain.bonilla
 */

@RequestMapping("/api/v1")
@RestController
@Api(value="User services", description="Services to access user information")
public class UserController {
    
    
    @ApiOperation(value = "Service create user", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Request Successfully"),
            @ApiResponse(code = 400, message = "Generic error to inform problems with the sended information"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Exception without treatment")
    })
    @GetMapping(value = "/example")
    public ResponseEntity<?>  createUserByTaxid(){
    
    	Map<String, String> userTokenDtoMap = new HashMap<String, String>();
    	userTokenDtoMap.put("id", "123456");
    	return ResponseEntity.ok().body(userTokenDtoMap);
    } 
}