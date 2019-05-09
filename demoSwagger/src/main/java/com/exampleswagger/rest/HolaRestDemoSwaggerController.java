package com.exampleswagger.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hola")
public class HolaRestDemoSwaggerController {
  @GetMapping
  public String hola() {
    return "Hola.";
  }
  
  @PostMapping("/post")
  public String holaPost(@RequestBody final String hola) {
    return hola;
  }
  
  @PutMapping("/put")
  public String holaPut(@RequestBody final String hola) {
    return hola;
  }
}
