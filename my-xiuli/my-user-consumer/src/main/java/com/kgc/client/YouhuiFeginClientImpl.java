package com.kgc.client;

import com.kgc.pojo.Youhui;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class YouhuiFeginClientImpl implements  YouhuiFeginClient{

    @Override
    public List<Youhui> showyouhui(String yprice) {
        return null;
    }

    @Override
    public Youhui getyouhui(Integer yhqid) {
        return null;
    }

    @Override
    public int getCount(String yprice) {
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
    public int deleteall(String yprice) {
        return 0;
    }
}
