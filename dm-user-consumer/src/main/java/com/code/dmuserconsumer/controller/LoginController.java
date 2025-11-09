package com.code.dmuserconsumer.controller;

import com.code.dmuserconsumer.client.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lucas
 * @date 2025/10/20 21:52
 * @description
 */
@RestController
public class LoginController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/login")
    public String login() {
        return userFeignClient.login();
    }

    /*@GetMapping(value = "/login", params = "userName")
    public String login(@RequestParam("userName") String userName) {
        if (userFeignClient.login(userName)) {
            return "hello," + userName + " 登陆成功";
        }
        return userName + " 登陆失败";
    }*/

    /*@GetMapping(value = "/login", params = {"userName", "password"})
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("userName", userName);
        userMap.put("password", password);
        if (userFeignClient.login(userMap)) {
            return "hello," + userName + " 登陆成功";
        }
        return userName + " 登陆失败";
    }*/

    /*@GetMapping(value = "/login", params = {"userName", "password"})
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password) {
        User user = new User(userName, password);
        if (userFeignClient.login(user)) {
            return "hello," + userName + " 登陆成功";
        }
        return userName + " 登陆失败";
    }*/
}
