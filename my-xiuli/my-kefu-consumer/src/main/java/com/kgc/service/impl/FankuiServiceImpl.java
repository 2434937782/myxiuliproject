package com.kgc.service.impl;

import com.kgc.client.FankuiFeignClient;
import com.kgc.pojo.Fankui;
import com.kgc.service.FankuiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FankuiServiceImpl implements FankuiService {
    @Autowired
    private FankuiFeignClient fankuiFeignClient;
    @Override
    public List<Fankui> getAllFankui() {
        return fankuiFeignClient.getAllFankui();
    }

    @Override
    public int update(Fankui fankui) {
        return fankuiFeignClient.update(fankui);
    }


    @Override
    public Fankui getById(Integer id) {
        return fankuiFeignClient.getById(id);
    }
}
