package com.pockettodo.pockettodo.Login;

import org.springframework.web.bind.annotation.PostMapping;

public class LoginController {

    LoginService loginService = new LoginServiceImpl();
    @PostMapping("Login")
    public String login() {
        return loginService.login();
    }
}
