package com.exampleswagger.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping
public class HolaRestDemoSwaggerController {
  @ApiOperation(value = "Return hola @ApiOperation.")
  @ApiResponses(value = {
      @ApiResponse(code = 100, message = "Message 100."),
      @ApiResponse(code = 200, message = "Successful saludos.")
  })
  @GetMapping("/api/1.0/saludos")
  public String hola() {
    return "Hola.";
  }
  
  @PostMapping("/api/1.0/saludos")
  public String holaPost(@RequestBody final String hola) {
    return hola;
  }
  
  @PutMapping("/api/1.0/saludos")
  public String holaPut(@RequestBody final String hola) {
    return hola;
  }
}
