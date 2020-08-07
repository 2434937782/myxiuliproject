package com.kgc.client.Impl;

import com.kgc.client.GLYongHuFeignClient;
import com.kgc.pojo.JingGao;
import com.kgc.pojo.Users;
import com.kgc.pojo.XinXi;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GLYongHuFeignClientImpl implements GLYongHuFeignClient {
    @Override
    public List<Users> getUserAll() {
        return null;
    }

    @Override
    public int addJingGao(JingGao jingGao) {
        return 0;
    }

    @Override
    public JingGao getJingGaoById(Integer id) {
        return null;
    }

    @Override
    public int addXinXi(XinXi xinxi) {
        return 0;
    }

    @Override
    public Users getUserById(Integer id) {
        return null;
    }

    @Override
    public int updateUser(Users users) {
        return 0;
    }

    @Override
    public int deleteUser(Integer id) {
        return 0;
    }
}
