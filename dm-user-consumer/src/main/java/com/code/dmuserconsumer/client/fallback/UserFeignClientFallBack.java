package com.code.dmuserconsumer.client.fallback;

import com.code.dmuserconsumer.client.UserFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author Lucas
 * @date 2025/10/29 08:46
 * @description
 */
@Component
public class UserFeignClientFallBack implements UserFeignClient {
    @Override
    public String login() {
        return "服务异常,请稍后再尝试登陆";
    }
}
