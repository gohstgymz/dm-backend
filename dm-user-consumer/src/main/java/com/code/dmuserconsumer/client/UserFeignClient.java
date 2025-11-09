package com.code.dmuserconsumer.client;

import com.code.dmuserconsumer.client.fallback.UserFeignClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Lucas
 * @date 2025/10/20 21:51
 * @description
 */
@FeignClient(name = "dm-user-provider",fallback = UserFeignClientFallBack.class)
public interface UserFeignClient {
    @GetMapping("/login")
    String login();

    /*@PostMapping("/login")
    boolean login(@RequestParam("name") String name);*/

    /*@PostMapping("/login")
    boolean login(@RequestBody Map userMap);*/

    /*@PostMapping("/login")
    boolean login(@RequestBody User user);*/
}
