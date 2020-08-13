package com.kgc.mapper;


import com.kgc.pojo.Youhui;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YouhuiMapper {

    public List<Youhui> getyouhui(Double yprice);

    public Youhui getyouhui(Integer yhqid);

    public int getCount(Double yprice);

    public int add(Youhui youhui);

    public int update(Youhui youhui);

    public int delete(Integer yhqid);

    public int deleteall(Double yprice);
}
