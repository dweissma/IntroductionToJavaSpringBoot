package com.example.springboot_505;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
  @RequestMapping("/")
  public String index(){
    return "index";
  }
}
