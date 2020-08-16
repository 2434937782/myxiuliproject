package com.kgc.service;

import com.kgc.mapper.YouhuiMapper;
import com.kgc.pojo.Youhui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestYouhuiService {

    @Autowired
    private YouhuiMapper youhuiMapper;
    @RequestMapping("/showyouhui")
    public List<Youhui> showyouhui(@RequestParam("yprice") String yprice) {
        return youhuiMapper.showyouhui(yprice);
    }

    @RequestMapping("/getyouhui/{yhqid}")
    public Youhui getyouhui(@PathVariable("yhqid")Integer yhqid) {
        return youhuiMapper.getyouhui(yhqid);
    }

    @RequestMapping("/getCount")
    public int getCount(@RequestParam("yprice") String yprice) {
        return youhuiMapper.getCount(yprice);
    }

    //添加
    @RequestMapping("/addyouhui")
    public int add(@RequestBody Youhui youhui) {
        return youhuiMapper.add(youhui);
    }

    //更新
    @RequestMapping("/updateyouhui")
    public int update(@RequestBody Youhui youhui) {
        return youhuiMapper.update(youhui);
    }

    //删除
    @RequestMapping("/delete/{yhqid}")
    public int delete(@PathVariable("yhqid") Integer yhqid) {
        return youhuiMapper.delete(yhqid);
    }

    //根据价格删除
    @RequestMapping("/deleteall")
    public int deleteall(@RequestParam("yprice") String yprice) {
        return youhuiMapper.deleteall(yprice);
    }
}
