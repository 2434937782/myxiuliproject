package com.kgc.controller;

import com.kgc.pojo.Ddxq;
import com.kgc.pojo.Dingdan;
import com.kgc.service.DingdanService;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DingdanController {
    @Autowired
    private DingdanService dingdanService;
    @RequestMapping("/getPage")
    public PageUtil<Dingdan> getPage(Integer userid,
                                     @RequestParam(value = "index",required =false, defaultValue = "1") Integer index,
                                     @RequestParam(value = "size",required =false, defaultValue = "2") Integer size){
        PageUtil<Dingdan> page=dingdanService.getPage(userid, index, size);
        page.setPageIndex(index);
        return page;
    }
    @RequestMapping("/dingdanadd")
    public int add(Dingdan dingdan){
        return dingdanService.add(dingdan);
    }

    @RequestMapping("/dingdanId")
    public Ddxq getById(Integer ddxqid){
        return dingdanService.getById(ddxqid);
    }
}
