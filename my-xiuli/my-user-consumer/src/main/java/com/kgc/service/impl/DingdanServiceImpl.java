package com.kgc.service.impl;


import com.kgc.client.DingdanFeignClient;
import com.kgc.pojo.Ddxq;
import com.kgc.pojo.Dingdan;
import com.kgc.service.DingdanService;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DingdanServiceImpl implements DingdanService {

    @Autowired
    private DingdanFeignClient dingdanFeignClient;


    @Override
    public PageUtil getPage(Integer userid, Integer index, Integer size) {
        Map<String,Object> map=new HashMap<>();
        map.put("userid",userid);
        map.put("start",(index-1)*size);
        map.put("size",size);
        map.put("index",index);
        return dingdanFeignClient.getdingdan(map);
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
