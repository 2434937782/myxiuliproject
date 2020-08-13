package com.kgc.service;

import com.kgc.pojo.Colour;
import com.kgc.pojo.Good;
import com.kgc.pojo.Pinpai;
import com.kgc.pojo.Xinghao;

import java.util.List;

public interface GoodService {
    //查商品
    public List<Good> getGood(Integer W_id);

    //查商品品牌
    public List<Pinpai> getGoodpp(Integer P_id);

    //查商品型号
    public List<Xinghao> getGoodxh(Integer xh_id);

    //查商品颜色
    public List<Colour> getGoodColor(Integer y_id);
}
