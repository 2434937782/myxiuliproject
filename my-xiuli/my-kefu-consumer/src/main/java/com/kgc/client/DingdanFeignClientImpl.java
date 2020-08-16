package com.kgc.client;

import com.kgc.pojo.Dingdan;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DingdanFeignClientImpl implements DingdanFeignClient{
    @Override
    public List<Dingdan> getAllDindan() {
        return null;
    }

    @Override
    public Dingdan getByphone(String djiphone) {
        return null;
    }
}
