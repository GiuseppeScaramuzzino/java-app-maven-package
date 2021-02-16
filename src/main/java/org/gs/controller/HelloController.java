package org.gs.controller;

import org.gs.service.HelloService;

public class HelloController {

  private HelloService service = new HelloService();

  public void hello() {
    String message = service.hello().concat(" from Controller");
    System.out.println(message);
  }
}
