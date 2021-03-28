package io.sparrow.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    /**
     * 登录
     * @return
     */
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }



}
