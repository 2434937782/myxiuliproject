package com.kgc.client;

import com.kgc.pojo.Fankui;
import org.springframework.stereotype.Component;
import com.kgc.client.FankuiFeignClient;

import java.util.List;

@Component
public class FankuiFeignClientImpl implements FankuiFeignClient{
    @Override
    public List<Fankui> getAllFankui() {
        return null;
    }

    @Override
    public int update(Fankui fankui) {
        return 0;
    }


    @Override
    public Fankui getById(Integer id) {
        return null;
    }
}
