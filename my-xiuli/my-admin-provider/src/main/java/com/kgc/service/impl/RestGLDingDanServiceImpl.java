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

    @RequestMapping("/getid/{id}")
    public Dingdan getDingDanById(@PathVariable("id") Integer id) {
        return glDingDanMapper.getDingDanById(id);
    }

    @RequestMapping("/update")
    public int upadate(@RequestBody Dingdan dingdan) {
        return glDingDanMapper.upadate(dingdan);
    }

}
