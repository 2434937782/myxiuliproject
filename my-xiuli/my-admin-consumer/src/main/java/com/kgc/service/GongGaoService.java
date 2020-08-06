package com.kgc.service;

import com.kgc.pojo.Gonggao;

import java.util.List;

public interface GongGaoService {
    //分页
    public int getConout(String ggtitle);

    public List<Gonggao> getPage(String ggtitle, Integer index, Integer size);

    //添加
    public int add(Gonggao gonggao);

    //删除
    public int delete(Integer id);

    //修改
    public Gonggao getGonggaoById(Integer id);

    public int update(Gonggao gonggao);
}
