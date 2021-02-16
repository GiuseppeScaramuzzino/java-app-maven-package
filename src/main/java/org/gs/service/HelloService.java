package org.gs.service;

import org.gs.model.Hello;

public class HelloService {

  private Hello model = new Hello();

  public String hello() {
    return model.getMessage().concat(" from Service");
  }
}
