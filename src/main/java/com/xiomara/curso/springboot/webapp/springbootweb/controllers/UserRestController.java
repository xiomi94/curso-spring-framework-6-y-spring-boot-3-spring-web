package com.xiomara.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {
  
// @RequestMappi8ng(path="/details", method=RequestMethod.GET) /Esta es otra manera de hacerlo
  @GetMapping("/details")
  public Map<String, Object> details() {
    Map<String, Object> body = new HashMap<>();

    body.put("title", "Hola Mundo Spring Boot");
    body.put("name", "Xiomara");
    body.put("lastname", "Jiménez");
    return body;
  }
}
