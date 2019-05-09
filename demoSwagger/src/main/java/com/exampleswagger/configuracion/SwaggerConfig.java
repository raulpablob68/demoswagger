package com.exampleswagger.configuracion;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

  /**
   * Docket.
   * 
   * @return Docket.
   */
  public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.basePackage("com.exampleswagger"))
        .paths(regex("/rest.*")).build().apiInfo(metaInfo());
  }

  private ApiInfo metaInfo() {
    ApiInfo apiInfo = new ApiInfo("Sprint Boot Swagger Example API.", "Spring Boot Swagger example API for bootcamp.", "1.0.0", "Terms of service.", new Contact("rPabloBarrientosf", "hhtps://nourlyet.com", "no.email@yet.com"), "Apache License version 2.0", "http://www.apache.org/license.html");
    return apiInfo;
  }
}
