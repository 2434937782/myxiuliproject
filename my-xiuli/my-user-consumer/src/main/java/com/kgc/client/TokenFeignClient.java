package com.kgc.client;

import com.kgc.pojo.Users;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "my-user-provider", fallback = TokenFeignClientImpl.class)
public interface TokenFeignClient {
    @RequestMapping("/generateToken")
    public String generateToken(@RequestParam("userAgent") String userAgent,@RequestBody Users users);
    @RequestMapping("/save")
    public void save(@RequestParam("token") String token,@RequestBody Users user);
    @RequestMapping("/getToken")
    public Users getToken(@RequestParam("token") String token);
}
