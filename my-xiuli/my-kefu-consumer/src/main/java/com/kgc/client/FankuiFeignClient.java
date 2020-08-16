package com.kgc.client;

import com.kgc.pojo.Fankui;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "my-provider",
        fallback = FankuiFeignClientImpl.class)
public interface FankuiFeignClient {

    //查询所有反馈
    @RequestMapping("/getAllFankui")
    public List<Fankui> getAllFankui();

    //回复用户反馈信息   修改的方式
    @RequestMapping("/updatefankui")
    public int update(@RequestBody Fankui fankui);

    @RequestMapping("/showFankuiId/{id}")
    public Fankui getById(@PathVariable("id") Integer id);
}
