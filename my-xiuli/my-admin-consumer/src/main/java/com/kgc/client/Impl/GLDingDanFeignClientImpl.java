package com.kgc.client.Impl;

import com.kgc.client.GLDingDanFeignClient;
import com.kgc.pojo.Dingdan;
import org.springframework.stereotype.Component;

@Component
public class GLDingDanFeignClientImpl implements GLDingDanFeignClient {
    @Override
    public Dingdan getDingDanById(Integer ddid) {
        return null;
    }

    @Override
    public int update(Dingdan dingdan) {
        return 0;
    }
}
