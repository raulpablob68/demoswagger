package com.exampleswagger.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/hola")
public class HolaRestDemoSwaggerController {
  @GetMapping("/api/1.0/hola")
  public String hola() {
    return "Hola.";
  }
  
  @PostMapping("/api/1.0/hola")
  public String holaPost(@RequestBody final String hola) {
    return hola;
  }
  
  @PutMapping("/api/1.0/hola")
  public String holaPut(@RequestBody final String hola) {
    return hola;
  }
}
