package com.kgc.client;

import com.kgc.pojo.Ddxq;
import com.kgc.pojo.Dingdan;
import com.kgc.util.PageUtil;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(name = "my-user-provider", fallback = DingdanFeignClientImpl.class)
public interface DingdanFeignClient {
    @RequestMapping("/getDingdanPage")
    public PageUtil getdingdan(@RequestParam Map<String, Object> parma);

    @RequestMapping("/addDingdan")
    public int add(@RequestBody Dingdan dingdan);

    @RequestMapping("/getDingdan/{ddxqid}")
    public Ddxq getById(@PathVariable("ddxqid") Integer ddxqid);
}
