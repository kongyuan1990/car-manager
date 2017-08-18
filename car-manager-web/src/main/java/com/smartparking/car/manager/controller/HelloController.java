package com.smartparking.car.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartparking.car.manager.service.HelloService;

@RequestMapping("/test")
@Controller
public class HelloController {

  @Autowired
  HelloService helloService;
  
  @ResponseBody
  @RequestMapping("/hello")
  public String sayHello(){
      String sayHello = helloService.toSayHello();
      
      System.out.println("hello");
      
    return sayHello;
      
      
  }


}
