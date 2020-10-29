package com.note.back.controller;

import com.note.back.domain.User;
import com.note.back.service.UserService;
import com.note.back.util.Result;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Object register(@RequestBody User bean) {
        String username = bean.getUsername();
        username = HtmlUtils.htmlEscape(username);
        bean.setUsername(username);
        boolean isExist = userService.isExist(username);
        if(isExist){
            return "用户名已存在";
        }
        String password = bean.getPassword();
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        int times = 2;
        String algorithm = "md5";
        String pwdAfterHash = new SimpleHash(algorithm, password, salt, times).toString();
        bean.setPassword(pwdAfterHash);
        bean.setSalt(salt);
        userService.add(bean);
        return Result.success();
    }

    @PostMapping("/login")
    public Object login(@RequestBody User bean) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(bean.getUsername(), bean.getPassword());

        try {
            subject.login(usernamePasswordToken);
            return Result.success(usernamePasswordToken);
        }catch (AuthenticationException e){
            return Result.fail("用户名或密码错误");
        }

    }

}

