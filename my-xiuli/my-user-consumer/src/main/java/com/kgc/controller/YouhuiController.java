package com.kgc.controller;

import com.kgc.pojo.Youhui;
import com.kgc.service.YouhuiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class YouhuiController {
    @Autowired
    private YouhuiService youhuiService;
    @RequestMapping("/showyouhui")
    public List<Youhui> showyouhui(String yprice){
        return youhuiService.showyouhui(yprice);
    }
    @RequestMapping("/getyouhui")
    public Youhui getyouhui(Integer yhqid){
        return youhuiService.getyouhui(yhqid);
    }

    @RequestMapping("/getCount")
    public int getCount(String yprice){
        return youhuiService.getCount(yprice);
    }

    @RequestMapping("/addyouhui")
    public int add( Youhui youhui){
        return youhuiService.add(youhui);
    }

    @RequestMapping("/updateyouhui")
    public int update(Youhui youhui){
        return youhuiService.update(youhui);
    }

    @RequestMapping("/delete")
    public int delete(Integer yhqid){
        return youhuiService.delete(yhqid);
    }

    @RequestMapping("/deleteall")
    public int deleteall(String yprice){
        return youhuiService.deleteall(yprice);
    }

}
