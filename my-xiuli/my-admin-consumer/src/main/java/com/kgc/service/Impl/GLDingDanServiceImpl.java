package com.kgc.service.Impl;

import com.kgc.client.GLDingDanFeignClient;
import com.kgc.pojo.Dingdan;
import com.kgc.service.GLDingDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GLDingDanServiceImpl implements GLDingDanService {
    @Autowired
    private GLDingDanFeignClient glDingDanFeignClient;

    @Override
    public Dingdan getDingDanById(Integer ddid) {
        return glDingDanFeignClient.getDingDanById(ddid);
    }

    @Override
    public int update(Dingdan dingdan) {
        return glDingDanFeignClient.update(dingdan);
    }
}
