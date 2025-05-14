package com.xiomara.curso.springboot.webapp.springbootweb.controllers;

import com.xiomara.curso.springboot.webapp.springbootweb.models.User;
import com.xiomara.curso.springboot.webapp.springbootweb.models.dto.ParamDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

  @GetMapping("/baz/{message}")
  public ParamDTO baz(
          @PathVariable String message
  ) {

    ParamDTO param = new ParamDTO();
    param.setMessage(message);
    return param;
  }

  @GetMapping("/detail/{dni}/obtener/{replaceEmail}")
  public User getUser(
          @PathVariable String dni,
          @PathVariable String replaceEmail
  ) {
    User user1 = new User("carlos", "x", "x", "AAA");
    User user2 = new User("xiomi", "x", "x", "BBB");
    User user3 = new User("xiomi", "x", "x", "CCC");

    List<User> userList = Arrays.asList(user1, user2, user3);

    User userFound = null;

    for (User userIterate : userList) {
      if (userIterate.getDni().equalsIgnoreCase(dni)) {
        userFound = userIterate;
        userFound.setEmail(replaceEmail);
        break;
      }
    }

    return userFound;
  }

  @PostMapping("/create")
  public User create(@RequestBody User user) {
    //hacer algo con el usuario, save en la bbdd
    user.setName(user.getName().toUpperCase());

    return user;
  }

}
