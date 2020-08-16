package com.kgc.client;

import com.kgc.pojo.Colour;
import com.kgc.pojo.Good;
import com.kgc.pojo.Pinpai;
import com.kgc.pojo.Xinghao;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@FeignClient(name = "my-user-provider", fallback = GoodFeignClientImpl.class)
public interface GoodFeignClient {

    @RequestMapping("/getGood")
    public List<Good> getGood(@PathVariable("id") Integer W_id);

    @RequestMapping("/getGoodpp")
    public List<Pinpai> getGoodpp(@PathVariable("id") Integer P_id);

    @RequestMapping("/getGoodxh")
    public List<Xinghao> getGoodxh(@PathVariable("id") Integer xh_id);

    @RequestMapping("/getGoodColor")
    public List<Colour> getGoodColor(@PathVariable("id") Integer y_id);
}
