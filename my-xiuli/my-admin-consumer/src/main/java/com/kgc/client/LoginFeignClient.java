package com.kgc.client;

import com.kgc.client.Impl.LoginFeignClientImpll;
import com.kgc.pojo.Personnel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(name = "my-admin-provider", fallback = LoginFeignClientImpll.class)
public interface LoginFeignClient {
    @RequestMapping("/getPerson")
    public Personnel getPerson(@RequestParam("gl_name") String gl_name,
                               @RequestParam("gl_Password") String gl_Password);
}
