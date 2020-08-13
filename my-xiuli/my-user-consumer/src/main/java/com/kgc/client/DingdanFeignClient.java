package com.kgc.client;

import com.kgc.pojo.Ddxq;
import com.kgc.pojo.Dingdan;
import org.springframework.cloud.netflix.feign.FeignClient;

import java.util.List;

@FeignClient(name = "my-provider", fallback = DingdanFeignClientImpl.class)
public interface DingdanFeignClient {

    public List<Dingdan> getdingdan();

    //订单数量
    public int count();

    //添加订单
    public int add(Dingdan dingdan);

    //订单详情
    public Ddxq getById(Integer ddxqid);
}
