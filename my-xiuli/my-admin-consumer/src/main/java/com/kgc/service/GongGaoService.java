package com.kgc.service;

import com.kgc.pojo.Gonggao;
import com.kgc.util.PageUtil;

import java.util.List;

public interface GongGaoService {
    public PageUtil getPage(String ggtitle, Integer index, Integer size);

    //添加
    public int add(Gonggao gonggao);

    //删除
    public int delete(Integer id);

    //修改
    public Gonggao getGonggaoById(Integer id);

    public int ggupdate(Gonggao gonggao);
}
