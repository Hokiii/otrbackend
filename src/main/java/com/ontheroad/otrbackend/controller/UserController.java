package com.ontheroad.otrbackend.controller;

import com.ontheroad.otrbackend.model.User;
import com.ontheroad.otrbackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin  //允许跨域
@Slf4j
public class UserController {

    private UserService userService;

    @RequestMapping(path="/login",method = RequestMethod.GET)
    public String getLogin() {
        return "login";
    }

    @RequestMapping(path="/login",method = RequestMethod.POST)
    @ResponseBody
    public String postLogin(@RequestBody User user) {
        log.info("接收到的对象："+ user);
        String result = userService.getPasswordByPhoneNumber(user.getPhonenumber());
        log.info("密码："+ result);
        return "ok";
    }

}
