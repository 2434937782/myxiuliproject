package com.kgc.service;

import com.kgc.mapper.YouhuiMapper;
import com.kgc.pojo.Youhui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestYouhuiService {

    @Autowired
    private YouhuiMapper youhuiMapper;

    public List<Youhui> getyouhui(Double yprice) {
        return youhuiMapper.getyouhui(yprice);
    }

    //
    public Youhui getyouhui(Integer yhqid) {
        return youhuiMapper.getyouhui(yhqid);
    }

    public int getCount(Double yprice) {
        return youhuiMapper.getCount(yprice);
    }

    //添加
    public int add(Youhui youhui) {
        return youhuiMapper.add(youhui);
    }

    //更新
    public int update(Youhui youhui) {
        return youhuiMapper.update(youhui);
    }

    //删除
    public int delete(Integer yhqid) {
        return youhuiMapper.delete(yhqid);
    }

    //根据价格删除
    public int deleteall(Double yprice) {
        return youhuiMapper.deleteall(yprice);
    }
}
