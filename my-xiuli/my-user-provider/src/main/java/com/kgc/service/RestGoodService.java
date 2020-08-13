package com.kgc.service;

import com.kgc.mapper.GoodMapper;
import com.kgc.pojo.Colour;
import com.kgc.pojo.Good;
import com.kgc.pojo.Pinpai;
import com.kgc.pojo.Xinghao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestGoodService {

    @Autowired
    private GoodMapper goodMapper;

    @RequestMapping("/getGood")
    public List<Good> getGood(@PathVariable("id") Integer W_id) {
        return goodMapper.getGood(W_id);
    }

    @RequestMapping("/getGoodpp")
    public List<Pinpai> getGoodpp(@PathVariable("id") Integer P_id) {
        return goodMapper.getGoodpp(P_id);
    }

    @RequestMapping("/getGoodxh")
    public List<Xinghao> getGoodxh(@PathVariable("id") Integer xh_id) {
        return goodMapper.getGoodxh(xh_id);
    }

    @RequestMapping("/getGoodColor")
    public List<Colour> getGoodColor(@PathVariable("id") Integer y_id) {
        return goodMapper.getGoodColor(y_id);
    }
}
