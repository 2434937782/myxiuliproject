package com.kgc.client;


import com.kgc.pojo.Ddxq;
import com.kgc.pojo.Dingdan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DingdanFeignClientImpl implements DingdanFeignClient {

    @Override
    public List<Dingdan> getdingdan() {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }


    @Override
    public int add(Dingdan dingdan) {
        return 0;
    }

    @Override
    public Ddxq getById(Integer ddxqid) {
        return null;
    }
}
