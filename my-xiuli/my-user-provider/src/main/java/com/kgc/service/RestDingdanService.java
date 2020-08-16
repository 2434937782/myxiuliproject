package com.kgc.service;

import com.kgc.mapper.DingdanMapper;
import com.kgc.pojo.Ddxq;
import com.kgc.pojo.Dingdan;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class RestDingdanService {
    @Autowired
    private DingdanMapper dingdanMapper;

    //查看所有订单
    @RequestMapping("/getDingdanPage")
    public PageUtil getdingdan(@RequestParam Map<String, Object> parma) {
        PageUtil page = new PageUtil();
        //当前页面
        Integer index = Integer.parseInt(parma.get("index").toString());
        page.setPageIndex(index);
        //每页条数
        Integer size = Integer.parseInt(parma.get("size").toString());
        page.setPageSize(size);
        //调用mapper方法
        List<Dingdan> list = (List<Dingdan>) dingdanMapper.getdingdan(parma);
        int count = dingdanMapper.count(parma);
        page.setList(list);
        page.setTotalCount(count);
        return page;
    }


    @RequestMapping("/addDingdan")
    public int add(@RequestBody Dingdan dingdan) {
        int count = dingdanMapper.add(dingdan);
        return count;
    }

    @RequestMapping("/getDingdan/{ddxqid}")
    public Ddxq getById(@PathVariable("ddxqid") Integer ddxqid) {
        return dingdanMapper.getById(ddxqid);
    }
}
