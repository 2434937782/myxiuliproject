package com.kgc.service.impl;

import com.kgc.pojo.Youhui;
import com.kgc.service.YouhuiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YouhuiServiceimpl implements YouhuiService {
    @Override
    public List<Youhui> getyouhui(Double yprice) {
        return null;
    }

    @Override
    public Youhui getyouhui(Integer yhqid) {
        return null;
    }

    @Override
    public int getCount(Double yprice) {
        return 0;
    }

    @Override
    public int add(Youhui youhui) {
        return 0;
    }

    @Override
    public int update(Youhui youhui) {
        return 0;
    }

    @Override
    public int delete(Integer yhqid) {
        return 0;
    }

    @Override
    public int deleteall(Double yprice) {
        return 0;
    }
}
