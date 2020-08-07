package com.kgc.service.impl;

import com.kgc.mapper.GLYongHuMapper;
import com.kgc.pojo.JingGao;
import com.kgc.pojo.Users;
import com.kgc.pojo.XinXi;
import com.kgc.util.PageUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestGLYongHuServiceImpl {
    @Autowired
    private GLYongHuMapper glYongHuMapper;

    //查看数据库中的违规昵称
    @RequestMapping("/getUserAll")
    public List<Users> getUserAll() {
        return glYongHuMapper.getUserAll();
    }

    //警告表添加  被警告人
    @RequestMapping("/addJingGao")
    public int addJingGao(@RequestBody JingGao jingGao) {
        XinXi xinXi =new XinXi();
        if (glYongHuMapper.addXinXi(xinXi)>0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
        return glYongHuMapper.addJingGao(jingGao);
    }

    //信息表根据被警告人id发送信息
    @RequestMapping("/getJingGaoById/{id}")
    public JingGao getJingGaoById(@PathVariable("id") Integer id) {
        return glYongHuMapper.getJingGaoById(id);
    }

    @RequestMapping("/addXinXi")
    public int addXinXi(@RequestBody XinXi xinxi) {
        return glYongHuMapper.addXinXi(xinxi);
    }

    //修改用户信息
    @RequestMapping("/getUserById/{id}")
    public Users getUserById(@PathVariable("id") Integer id) {
        return glYongHuMapper.getUserById(id);
    }

    @RequestMapping("/updateUser")
    public int updateUser(@RequestBody Users users) {
        return glYongHuMapper.updateUser(users);
    }

    //删除用户
    @RequestMapping("/deleteUser/{id}")
    public int deleteUser(@PathVariable("id") Integer id) {
        return deleteUser(id);
    }

}
