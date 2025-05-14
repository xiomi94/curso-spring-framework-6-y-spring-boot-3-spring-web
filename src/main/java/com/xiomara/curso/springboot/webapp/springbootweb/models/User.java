package com.xiomara.curso.springboot.webapp.springbootweb.models;

public class User {

  private String name;
  private String lastName;
  private String email;
  private String dni;

  public User(String name, String lastName, String email, String dni) {
    this.name = name;
    this.lastName = lastName;
    this.email = email;
    this.dni = dni;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDni() {
    return this.dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }
}
