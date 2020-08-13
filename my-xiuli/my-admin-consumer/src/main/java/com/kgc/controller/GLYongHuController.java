package com.kgc.controller;

import com.kgc.pojo.JingGao;
import com.kgc.pojo.Users;
import com.kgc.pojo.XinXi;
import com.kgc.service.GLYongHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class GLYongHuController {

    @Autowired
    private GLYongHuService glYongHuService;

    //查看数据库中的违规昵称
    @RequestMapping("/getUserAll")
    public List<Users> getUserAll() {
        return glYongHuService.getUserAll();
    }

    //警告表添加  被警告人
    @RequestMapping("/addJingGao")
    public int addJingGao(@RequestBody JingGao jingGao) {
        return glYongHuService.addJingGao(jingGao);
    }

    //信息表根据被警告人id发送信息
    @RequestMapping("/getJingGaoById")
    public JingGao getJingGaoById(Integer jgid) {
        return glYongHuService.getJingGaoById(jgid);
    }


    @RequestMapping("/addXinXi")
    public int addXinXi(@RequestBody XinXi xinxi) {
        return glYongHuService.addXinXi(xinxi);
    }

    //修改用户信息
    @RequestMapping("/getUserById")
    public Users getUserById(Integer id) {
        return glYongHuService.getUserById(id);
    }

    @RequestMapping("/updateUser")
    public int updateUser(@RequestBody Users users) {
        return glYongHuService.updateUser(users);
    }

    //删除用户
    @RequestMapping("/deleteUser")
    public int deleteUser(Integer id) {
        return glYongHuService.deleteUser(id);
    }
}
