package com.xiomara.curso.springboot.webapp.springbootweb.models.dto;

import com.xiomara.curso.springboot.webapp.springbootweb.models.User;

public class UserDTO {
  private String title;
  private User user;

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
