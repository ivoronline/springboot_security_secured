package com.ivoronline.springboot_security_secured.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //===================================================================================
  // USER GUEST
  //===================================================================================
  @Secured({"ROLE_USER", "ROLE_GUEST"})
  @RequestMapping("UserGuest")
   String userGuest() {
    return "Hello from UserGuest";
  }

  //===================================================================================
  // ADMIN
  //===================================================================================
  @Secured("ROLE_ADMIN")
  @RequestMapping("Admin")
   String admin() {
    return "Hello from Admin";
  }

}

