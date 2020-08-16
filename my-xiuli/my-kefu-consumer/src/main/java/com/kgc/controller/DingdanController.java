package com.kgc.controller;

import com.kgc.pojo.Dingdan;
import com.kgc.service.DingdanService;
import com.kgc.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class DingdanController {
    @Autowired
    private DingdanService dingdanService;
    //查询所有订单
    @RequestMapping("/getAllDindan")
    public List<Dingdan> getAllDindan(){
        return  dingdanService.getAllDindan();
    }
    //根据手机号查看订单
    @RequestMapping("/getByphone")
    public Dingdan getByphone (String djiphone){
        return  dingdanService.getByphone(djiphone);
    }
}
