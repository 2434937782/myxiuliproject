package com.kgc.client;

import com.kgc.client.Impl.GLYongHuFeignClientImpl;
import com.kgc.client.Impl.GongGaoFeignClientImpl;
import com.kgc.pojo.Gonggao;
import com.kgc.util.PageUtil;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "my-admin-provider", fallback = GongGaoFeignClientImpl.class)
public interface GongGaoFeignClient {
    //分页
    @RequestMapping("/getPage")
    public PageUtil getPage(@RequestParam("ggtitle") String ggtitle,
                            @RequestParam("index") Integer index,
                            @RequestParam("size") Integer size);

    //添加
    @RequestMapping("/add")
    public int add(Gonggao gonggao);

    //删除
    @RequestMapping("/delete/{ggid}")
    public int delete(Integer ggid);

    //修改
    @RequestMapping("/getGonggaoById/{ggid}")
    public Gonggao getGonggaoById(Integer ggid);

    @RequestMapping("/ggupdate")
    public int ggupdate(Gonggao gonggao);
}
