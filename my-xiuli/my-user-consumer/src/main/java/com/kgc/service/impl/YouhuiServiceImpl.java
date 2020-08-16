package com.kgc.service.impl;

import com.kgc.client.YouhuiFeginClient;
import com.kgc.pojo.Youhui;
import com.kgc.service.YouhuiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YouhuiServiceImpl implements YouhuiService {
    @Autowired
    private YouhuiFeginClient youhuiFeginClient;


    @Override
    public List<Youhui> showyouhui(String yprice) {
        return youhuiFeginClient.showyouhui(yprice);
    }

    @Override
    public Youhui getyouhui(Integer yhqid) {
        return youhuiFeginClient.getyouhui(yhqid);
    }

    @Override
    public int getCount(String yprice) {
        return youhuiFeginClient.getCount(yprice);
    }

    @Override
    public int add(Youhui youhui) {
        return youhuiFeginClient.add(youhui);
    }

    @Override
    public int update(Youhui youhui) {
        return youhuiFeginClient.update(youhui);
    }

    @Override
    public int delete(Integer yhqid) {
        return youhuiFeginClient.delete(yhqid);
    }

    @Override
    public int deleteall(String yprice) {
        return youhuiFeginClient.deleteall(yprice);
    }
}
