package com.kgc.service.impl;


import com.kgc.client.DingdanFeignClient;
import com.kgc.pojo.Ddxq;
import com.kgc.pojo.Dingdan;
import com.kgc.service.DingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DingdanServiceimpl implements DingdanService {

    @Autowired
    private DingdanFeignClient dingdanFeignClient;

    @Override
    public List<Dingdan> getdingdan() {
        return dingdanFeignClient.getdingdan();
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int add(Dingdan dingdan) {
        return dingdanFeignClient.add(dingdan);
    }

    @Override
    public Ddxq getById(Integer ddxqid) {
        return dingdanFeignClient.getById(ddxqid);
    }
}
