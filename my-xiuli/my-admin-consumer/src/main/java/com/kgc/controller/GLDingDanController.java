package com.kgc.controller;

import com.kgc.pojo.Dingdan;
import com.kgc.service.GLDingDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class GLDingDanController {
    @Autowired
    private GLDingDanService glDingDanService;

    //继续维修  修改  维修价格，状态
    @RequestMapping("/getid/{ddid}")
    public Dingdan getDingDanById(@PathVariable("ddid") Integer ddid) {
        return glDingDanService.getDingDanById(ddid);
    }

    @RequestMapping("/update")
    public int update(@RequestBody Dingdan dingdan) {
        return glDingDanService.update(dingdan);
    }
}
