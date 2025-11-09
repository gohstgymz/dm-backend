package com.code.dmuserprovider.service;

import com.code.pojo.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lucas
 * @date 2025/10/20 21:43
 * @description
 */
@RestController
public class UserService {
    @GetMapping("/login")
    public String login() {
        return "用户登陆验证";
    }

    @PostMapping(value = "/login",params = "name")
    public boolean login(@RequestParam("name") String name) {
        return "Feign".equals(name);
    }

    /*@PostMapping(value = "/login")
    public boolean login(@RequestBody Map userMap) {
        String userName = (String) userMap.get("userName");
        String password = (String) userMap.get("password");
        return "Feign".equals(userName) && "123456".equals(password);
    }*/

    @PostMapping(value = "/login")
    public boolean login(@RequestBody User user) {
        return "Feign".equals(user.getUserName()) && "123456".equals(user.getPassword());
    }
}
