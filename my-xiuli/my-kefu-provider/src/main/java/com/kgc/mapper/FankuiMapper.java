package com.kgc.mapper;

import com.kgc.pojo.Fankui;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FankuiMapper {
    //查询所有反馈
    public List<Fankui> getAllFankui();
    //回复用户反馈信息   修改的方式
    public int update(Fankui fankui);
    //用户输入id查询反馈
    public Fankui getById(Integer id);
}
