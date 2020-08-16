package com.kgc.service.impl;

import com.kgc.client.DingdanFeignClient;
import com.kgc.client.FankuiFeignClient;
import com.kgc.pojo.Dingdan;
import com.kgc.service.DingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DingdanServiceImpl implements DingdanService {
    @Autowired
    private DingdanFeignClient dingdanFeignClient;
    @Override
    public List<Dingdan> getAllDindan() {
        return dingdanFeignClient.getAllDindan();
    }

    @Override
    public Dingdan getByphone(String djiphone) {
        return dingdanFeignClient.getByphone(djiphone);
    }
}
