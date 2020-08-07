package com.kgc.client;

import com.kgc.client.Impl.GLYongHuFeignClientImpl;
import com.kgc.client.Impl.GongGaoFeignClientImpl;
import com.kgc.pojo.Gonggao;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "my-admin-provider", fallback = GongGaoFeignClientImpl.class)
public interface GongGaoFeignClient {
    //分页
    public int getConout(@RequestParam("ggtitle") String ggtitle);
    @RequestMapping("/getPage")
    public List<Gonggao> getPage(@RequestParam("ggtitle") String ggtitle,
                                 @RequestParam("index") Integer index,
                                 @RequestParam("size") Integer size);

    //添加
    @RequestMapping("/add")
    public int add(Gonggao gonggao);

    //删除
    @RequestMapping("/delete/{id}")
    public int delete(Integer id);

    //修改
    @RequestMapping("/getGonggaoById/{id}")
    public Gonggao getGonggaoById(Integer id);
    @RequestMapping("/ggupdate")
    public int ggupdate(Gonggao gonggao);
}
