package com.kgc.mapper;

import com.kgc.pojo.JingGao;
import com.kgc.pojo.Users;
import com.kgc.pojo.XinXi;

public interface GLYongHuMapper {
    //警告表添加  被警告人
    public int add(JingGao jingGao);
    //信息表根据被警告人id发送信息
    public JingGao getById(JingGao jingGao);
    public int addXinXi(XinXi xinxi);
    //修改用户信息
    public int update(Users users);
    //删除用户
    public int delete(Integer id);
}
