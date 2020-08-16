package com.kgc.client;


import com.kgc.pojo.Ddxq;
import com.kgc.pojo.Dingdan;
import com.kgc.util.PageUtil;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DingdanFeignClientImpl implements DingdanFeignClient {


    @Override
    public PageUtil getdingdan(Map<String, Object> parma) {
        return null;
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
