package io.sparrow.oauth.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import io.sparrow.oauth.constant.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
public class LoginController {


    @Autowired
    private DefaultKaptcha defaultKaptcha;
    /**
     * 登录页面
     * @param request
     * @return
     */
    @GetMapping("/auth/login")
    public String login(HttpServletRequest request){
        return "login";
    }


    /**
     * 验证码
     */
    @GetMapping("/auth/captcha.jpg")
    public void captcha(HttpServletRequest request,HttpServletResponse response) throws  IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");
        //获取图片验证码
        String text = this.defaultKaptcha.createText();
        request.getSession().setAttribute(Constants.CAPTCHA_TEXT,text);
        BufferedImage image = this.defaultKaptcha.createImage(text);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        out.close();
    }
}
