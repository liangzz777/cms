package com.briup.cms.web.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "登录管理")
public class LoginController {

    @PostMapping("/authentication/form")
    public void login(String username,String password) {
    }
}
