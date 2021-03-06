package com.kgc.client;

import com.kgc.client.Impl.GLDingDanFeignClientImpl;
import com.kgc.pojo.Dingdan;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "my-admin-provider", fallback = GLDingDanFeignClientImpl.class)
public interface GLDingDanFeignClient {
    //继续维修  修改  维修价格，状态
    @RequestMapping("/getid/{ddid}")
    public Dingdan getDingDanById(@PathVariable("ddid") Integer ddid);

    @RequestMapping("/update")
    public int update(@RequestBody Dingdan dingdan);
}

