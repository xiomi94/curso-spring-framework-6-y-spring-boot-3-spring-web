package com.xiomara.curso.springboot.webapp.springbootweb.controllers;

import com.xiomara.curso.springboot.webapp.springbootweb.models.User;
import com.xiomara.curso.springboot.webapp.springbootweb.models.dto.UserDTO;
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
  public UserDTO details() {
    UserDTO userDTO = new UserDTO();
    User user = new User("Xiomara", "Jiménez", "xomi94@gmail.com", "54136071M ");
    userDTO.setUser(user);
    userDTO.setTitle("Hola Mundo Spring Boot");
//    Map<String, Object> body = new HashMap<>();
//
//    body.put("title", "Hola Mundo Spring Boot");
//    body.put("user", user);
    return userDTO;
  }
}
