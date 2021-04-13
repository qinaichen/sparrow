package io.sparrow.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    /**
     * 登录页面
     * @param request
     * @return
     */
    @GetMapping("/sys/login")
    public String login(HttpServletRequest request){
        return "login";
    }
}
