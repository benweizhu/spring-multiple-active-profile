package me.zeph.multiple.active.profiles.mutipleactiveprofiles;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile({"!dev", "!uat"})
@RestController
public class CustomerController {
  @RequestMapping(value = "/hello")
  public String hello(){
    return "hello";
  }
}
