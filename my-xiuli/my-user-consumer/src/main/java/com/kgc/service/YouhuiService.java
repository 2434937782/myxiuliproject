package com.kgc.service;

import com.kgc.pojo.Youhui;

import java.util.List;

public interface YouhuiService {
    public List<Youhui> showyouhui(String yprice);

    public Youhui getyouhui(Integer yhqid);

    public int getCount(String yprice);

    public int add(Youhui youhui);

    public int update(Youhui youhui);

    public int delete(Integer yhqid);

    public int deleteall(String yprice);
}
