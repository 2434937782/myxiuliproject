package com.kgc.mapper;

import com.kgc.pojo.Dingdan;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GLDingDanMapper {
    //继续维修  修改  维修价格，状态
    public Dingdan getDingDanById(Integer id);
    public int upadate(Dingdan dingdan);
}
