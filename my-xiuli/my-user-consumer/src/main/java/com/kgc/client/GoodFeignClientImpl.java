package com.kgc.client;

import com.kgc.pojo.Colour;
import com.kgc.pojo.Good;
import com.kgc.pojo.Pinpai;
import com.kgc.pojo.Xinghao;

import java.util.List;

public class GoodFeignClientImpl implements  GoodFeignClient{
    @Override
    public List<Good> getGood(Integer W_id) {
        return null;
    }

    @Override
    public List<Pinpai> getGoodpp(Integer P_id) {
        return null;
    }

    @Override
    public List<Xinghao> getGoodxh(Integer xh_id) {
        return null;
    }

    @Override
    public List<Colour> getGoodColor(Integer y_id) {
        return null;
    }
}
