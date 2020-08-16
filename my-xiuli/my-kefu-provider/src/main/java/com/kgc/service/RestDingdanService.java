package com.kgc.service;

import com.kgc.mapper.DingdanMapper;
import com.kgc.pojo.Dingdan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class   RestDingdanService {
    @Autowired
    DingdanMapper dingdanMapper;

    //查询所有订单
    @RequestMapping("/getAllDindan")
    public List<Dingdan> getAllDindan(){
        return dingdanMapper.getAllDindan();
    }
    //根据手机号查看订单
    @RequestMapping("/getByphone")
    public Dingdan getByphone (@RequestParam("djiphone") String djiphone){

        return dingdanMapper.getByphone(djiphone);
    }
}
