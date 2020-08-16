package com.kgc.client;

import com.kgc.pojo.Dingdan;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@FeignClient(name = "my-provider",
        fallback = DingdanFeignClientImpl.class)
public interface DingdanFeignClient {
    //查询所有订单
    @RequestMapping("/getAllDindan")
    public List<Dingdan> getAllDindan();

    //根据手机号查看订单
    @RequestMapping("/getByphone")
    public Dingdan getByphone(@RequestParam("djiphone") String djiphone);
}
