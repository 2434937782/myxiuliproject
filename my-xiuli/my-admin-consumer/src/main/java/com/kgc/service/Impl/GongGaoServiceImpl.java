package com.kgc.service.Impl;

import com.kgc.client.GongGaoFeignClient;
import com.kgc.pojo.Gonggao;
import com.kgc.service.GongGaoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GongGaoServiceImpl implements GongGaoService {
    @Autowired
    private GongGaoFeignClient gongGaoFeignClient;

    @Override
    public int getConout(String ggtitle) {
        return gongGaoFeignClient.getConout(ggtitle);
    }

    @Override
    public List<Gonggao> getPage(String ggtitle, Integer index, Integer size) {
        return gongGaoFeignClient.getPage(ggtitle,index,size);
    }

    @Override
    public int add(Gonggao gonggao) {
        return gongGaoFeignClient.add(gonggao);
    }

    @Override
    public int delete(Integer ggid) {
        return gongGaoFeignClient.delete(ggid);
    }

    @Override
    public Gonggao getGonggaoById(Integer ggid) {
        return gongGaoFeignClient.getGonggaoById(ggid);
    }

    @Override
    public int ggupdate(Gonggao gonggao) {
        return gongGaoFeignClient.ggupdate(gonggao);
    }
}
