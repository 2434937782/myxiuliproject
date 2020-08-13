package com.kgc.service.Impl;

import com.kgc.client.GLYongHuFeignClient;
import com.kgc.pojo.JingGao;
import com.kgc.pojo.Users;
import com.kgc.pojo.XinXi;
import com.kgc.service.GLYongHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GLYongHuServiceImpl implements GLYongHuService {

    @Autowired
    private GLYongHuFeignClient glYongHuFeignClient;

    @Override
    public List<Users> getUserAll() {
        return glYongHuFeignClient.getUserAll();
    }

    @Override
    public int addJingGao(JingGao jingGao) {
        return glYongHuFeignClient.addJingGao(jingGao);
    }

    @Override
    public JingGao getJingGaoById(Integer jgid) {
        return glYongHuFeignClient.getJingGaoById(jgid);
    }

    @Override
    public int addXinXi(XinXi xinxi) {
        return glYongHuFeignClient.addXinXi(xinxi);
    }

    @Override
    public Users getUserById(Integer id) {
        return glYongHuFeignClient.getUserById(id);
    }

    @Override
    public int updateUser(Users users) {
        return glYongHuFeignClient.updateUser(users);
    }

    @Override
    public int deleteUser(Integer id) {
        return glYongHuFeignClient.deleteUser(id);
    }
}
