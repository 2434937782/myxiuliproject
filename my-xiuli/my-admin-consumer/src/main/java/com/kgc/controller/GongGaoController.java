package com.kgc.controller;

import com.kgc.pojo.Gonggao;
import com.kgc.service.GongGaoService;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GongGaoController {

    @Autowired
    private GongGaoService gongGaoService;

    //分页
    @RequestMapping("/getPage")
    public PageUtil<Gonggao> getPage(String ggtitle,
                                     @RequestParam(value = "index", required = false, defaultValue = "1") Integer index,
                                     @RequestParam(value = "size", required = false, defaultValue = "3") Integer size) {
        PageUtil<Gonggao> page = gongGaoService.getPage(ggtitle, index, size);
        return page;
    }

    //添加
    @RequestMapping("/add")
    public int add(Gonggao gonggao) {
        return gongGaoService.add(gonggao);
    }

    //删除
    @RequestMapping("/delete")
    public int delete(Integer ggid) {
        return gongGaoService.delete(ggid);
    }

    //修改
    @RequestMapping("/getGonggaoById/{ggid}")
    public Gonggao getGonggaoById(Integer ggid) {
        return gongGaoService.getGonggaoById(ggid);
    }

    @RequestMapping("/ggupdate")
    public int ggupdate(Gonggao gonggao) {
        return gongGaoService.ggupdate(gonggao);
    }
}
