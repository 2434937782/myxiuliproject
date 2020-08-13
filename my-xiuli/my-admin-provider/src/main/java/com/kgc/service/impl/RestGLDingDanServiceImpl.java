package com.kgc.service.impl;

import com.kgc.mapper.GLDingDanMapper;
import com.kgc.pojo.Dingdan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestGLDingDanServiceImpl {
    @Autowired
    private GLDingDanMapper glDingDanMapper;

    @RequestMapping("/getDingDanById/{ddid}")
    public Dingdan getDingDanById(@PathVariable("ddid") Integer ddid) {
        return glDingDanMapper.getDingDanById(ddid);
    }

    @RequestMapping("/update")
    public int update(@RequestBody Dingdan dingdan) {
        return glDingDanMapper.update(dingdan);
    }

}
