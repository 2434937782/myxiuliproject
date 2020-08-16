package com.kgc.client;

import com.kgc.pojo.Youhui;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "my-user-provider", fallback = YouhuiFeginClientImpl.class)
public interface YouhuiFeginClient {
    @RequestMapping("/showyouhui")
    public List<Youhui> showyouhui(@RequestParam("yprice") String yprice);

    @RequestMapping("/getyouhui/{yhqid}")
    public Youhui getyouhui(@PathVariable("yhqid")Integer yhqid);

    @RequestMapping("/getCount")
    public int getCount(@RequestParam("yprice") String yprice);

    @RequestMapping("/addyouhui")
    public int add(@RequestBody Youhui youhui);

    @RequestMapping("/updateyouhui")
    public int update(@RequestBody Youhui youhui);

    @RequestMapping("/delete/{yhqid}")
    public int delete(@PathVariable("yhqid") Integer yhqid);

    @RequestMapping("/deleteall")
    public int deleteall(@RequestParam("yprice") String yprice);
}
