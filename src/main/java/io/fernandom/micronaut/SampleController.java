package io.fernandom.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/")
public class SampleController {

  @Get("hello")
  @Produces(MediaType.TEXT_PLAIN)
  public String hello(){
    return "hello";
  }
}
