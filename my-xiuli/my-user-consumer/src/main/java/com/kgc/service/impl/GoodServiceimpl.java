package com.kgc.service.impl;

import com.kgc.client.GoodFeignClient;
import com.kgc.pojo.Colour;
import com.kgc.pojo.Good;
import com.kgc.pojo.Pinpai;
import com.kgc.pojo.Xinghao;
import com.kgc.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceimpl implements GoodService {

    @Autowired
    private GoodFeignClient goodFeignClient;

    @Override
    public List<Good> getGood(Integer W_id) {
        return goodFeignClient.getGood(W_id);
    }

    @Override
    public List<Pinpai> getGoodpp(Integer P_id) {
        return goodFeignClient.getGoodpp(P_id);
    }

    @Override
    public List<Xinghao> getGoodxh(Integer xh_id) {
        return goodFeignClient.getGoodxh(xh_id);
    }

    @Override
    public List<Colour> getGoodColor(Integer y_id) {
        return goodFeignClient.getGoodColor(y_id);
    }
}
