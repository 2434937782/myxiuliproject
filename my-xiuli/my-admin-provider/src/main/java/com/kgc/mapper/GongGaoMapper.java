package com.kgc.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GongGaoMapper {
    //添加
    public int add(Gonggao gonggao);

    //删除
    public int delete(Integer id);
    //修改
    public GongGaoMapper getById(Integer id);
    public int update(GongGaoMapper gonggao);
}
