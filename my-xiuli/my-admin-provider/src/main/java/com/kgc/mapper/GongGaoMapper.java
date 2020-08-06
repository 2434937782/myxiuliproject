package com.kgc.mapper;

import com.kgc.pojo.Gonggao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GongGaoMapper {
    //分页
    public int getConout(@Param("ggtitle") String ggtitle);

    public List<Gonggao> getPage(@Param("ggtitle") String ggtitle, @Param("index") Integer index, @Param("size") Integer size);

    //添加
    public int add(Gonggao gonggao);

    //删除
    public int delete(Integer id);

    //修改
    public Gonggao getGonggaoById(Integer id);

    public int update(Gonggao gonggao);
}
