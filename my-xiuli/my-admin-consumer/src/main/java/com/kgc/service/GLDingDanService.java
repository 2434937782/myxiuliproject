package com.kgc.service;

import com.kgc.pojo.Dingdan;

public interface GLDingDanService {
    //继续维修  修改  维修价格，状态
    public Dingdan getDingDanById(Integer id);
    public int upadate(Dingdan dingdan);
}
