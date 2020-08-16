package com.kgc.service.Impl;

import com.kgc.client.GongGaoFeignClient;
import com.kgc.pojo.Gonggao;
import com.kgc.service.GongGaoService;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GongGaoServiceImpl implements GongGaoService {
    @Autowired
    private GongGaoFeignClient gongGaoFeignClient;

    @Override
    public PageUtil getPage(String ggtitle, Integer index, Integer size) {
        return gongGaoFeignClient.getPage(ggtitle, index, size);
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
