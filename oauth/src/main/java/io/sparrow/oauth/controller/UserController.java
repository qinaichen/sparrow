package io.sparrow.oauth.controller;

import io.sparrow.oauth.model.SysUser;
import io.sparrow.oauth.service.UserService;
import io.sparrow.oauth.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String users(){
        return "sys/users";
    }

    @GetMapping("/userList")
    @ResponseBody
    public Object userList(Integer page,Integer limit){
        Page<SysUser> users = this.userService.page(page, limit);

        return Result.success(users.getTotalElements(),users.getContent().stream().map(item->{item.setPassword(null);return item;}).collect(Collectors.toList()));
    }
}
