package com.kgc.service;

import com.kgc.pojo.JingGao;
import com.kgc.pojo.Users;
import com.kgc.pojo.XinXi;

import java.util.List;

public interface GLYongHuService {
    //查看数据库中的违规昵称
    public List<Users> getUserAll();
    //警告表添加  被警告人
    public int addJingGao(JingGao jingGao);
    //信息表根据被警告人id发送信息
    public JingGao getJingGaoById(JingGao jingGao);
    public int addXinXi(XinXi xinxi);
    //修改用户信息
    public Users getUserById(Integer id);
    public int updateUser(Users users);
    //删除用户
    public int deleteUser(Integer id);
}
