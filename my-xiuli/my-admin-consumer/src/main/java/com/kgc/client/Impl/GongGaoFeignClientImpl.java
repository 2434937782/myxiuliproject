package com.kgc.client.Impl;

import com.kgc.client.GongGaoFeignClient;
import com.kgc.pojo.Gonggao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GongGaoFeignClientImpl implements GongGaoFeignClient {
    @Override
    public int getConout(String ggtitle) {
        return 0;
}

    @Override
    public List<Gonggao> getPage(String ggtitle, Integer index, Integer size) {
        return null;
    }

    @Override
    public int add(Gonggao gonggao) {
        return 0;
    }

    @Override
    public int delete(Integer ggid) {
        return 0;
    }

    @Override
    public Gonggao getGonggaoById(Integer ggid) {
        return null;
    }

    @Override
    public int ggupdate(Gonggao gonggao) {
        return 0;
    }
}
