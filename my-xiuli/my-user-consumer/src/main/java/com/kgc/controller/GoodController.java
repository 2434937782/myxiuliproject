package com.kgc.controller;

import com.kgc.pojo.Colour;
import com.kgc.pojo.Good;
import com.kgc.pojo.Pinpai;
import com.kgc.pojo.Xinghao;
import com.kgc.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class GoodController {

    @Autowired
    private GoodService goodService;


    //查商品
    @RequestMapping("/getGood")
    public List<Good> getGood(Integer W_id){
        return goodService.getGood(W_id);
    }

    //查商品品牌
    @RequestMapping("/getGoodpp")
    public List<Pinpai> getGoodpp(Integer P_id){
        return goodService.getGoodpp(P_id);
    }

    //查商品型号
    @RequestMapping("/getGoodxh")
    public List<Xinghao> getGoodxh(Integer xh_id){
        return goodService.getGoodxh(xh_id);
    }

    //查商品颜色
    @RequestMapping("/getGoodColor")
    public List<Colour> getGoodColor(Integer y_id){
        return goodService.getGoodColor(y_id);
    }
}
