package com.kgc.service.impl;

import com.kgc.mapper.GongGaoMapper;
import com.kgc.pojo.Gonggao;
import com.kgc.util.PageUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestGongGaoServiceImpl {
    @Autowired
    private GongGaoMapper gongGaoMapper;

    @RequestMapping("/getPage")
    public PageUtil<Gonggao> getPage(@RequestParam("ggtitle") String ggtitle,
                                     @RequestParam("index") Integer index,
                                     @RequestParam("size") Integer size) {
        PageUtil page = new PageUtil();
        page.setPageIndex(index);
        page.setPageSize(size);
        int count = gongGaoMapper.getConout(ggtitle);
        page.setTotalCount(count);
        List<Gonggao> list = gongGaoMapper.getPage(ggtitle, (index-1)*size, size);
        page.setList(list);
        return page;
    }

    //添加
    @RequestMapping("/add")
    public int add(@RequestBody Gonggao gonggao) {
        return gongGaoMapper.add(gonggao);
    }

    //删除
    @RequestMapping("/delete/{ggid}")
    public int delete(@PathVariable("ggid") Integer ggid) {
        return gongGaoMapper.delete(ggid);
    }

    //修改
    @RequestMapping("/getGonggaoById/{ggid}")
    public Gonggao getGonggaoById(@PathVariable("ggid") Integer ggid) {
        return gongGaoMapper.getGonggaoById(ggid);
    }

    @RequestMapping("/ggupdate")
    public int ggupdate(@RequestBody Gonggao gonggao) {
        return gongGaoMapper.ggupdate(gonggao);
    }

}
