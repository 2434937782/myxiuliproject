package com.kgc.client;

import com.kgc.client.Impl.GLDingDanFeignClientImpl;
import com.kgc.client.Impl.GLYongHuFeignClientImpl;
import com.kgc.pojo.JingGao;
import com.kgc.pojo.Users;
import com.kgc.pojo.XinXi;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "my-admin-provider", fallback = GLYongHuFeignClientImpl.class)
public interface GLYongHuFeignClient {
    //查看数据库中的违规昵称
    @RequestMapping("/getUserAll")
    public List<Users> getUserAll();

    //警告表添加  被警告人
    @RequestMapping("/addJingGao")
    public int addJingGao(@RequestBody JingGao jingGao);

    //信息表根据被警告人id发送信息
    @RequestMapping("/getJingGaoById/{jgid}")
    public JingGao getJingGaoById(@PathVariable("jgid") Integer id);

    @RequestMapping("/addXinXi")
    public int addXinXi(@RequestBody XinXi xinxi);

    //修改用户信息
    @RequestMapping("/getUserById/{id}")
    public Users getUserById(@PathVariable("id") Integer id);

    @RequestMapping("/updateUser")
    public int updateUser(@RequestBody Users users);

    //删除用户
    @RequestMapping("/deleteUser/{id}")
    public int deleteUser(@PathVariable("id") Integer id);
}
