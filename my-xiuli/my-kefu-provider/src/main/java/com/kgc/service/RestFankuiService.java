package com.kgc.service;

import com.kgc.mapper.FankuiMapper;
import com.kgc.pojo.Fankui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestFankuiService {

    @Autowired
    FankuiMapper fankuiMapper;

    @RequestMapping("/showFankui")
    public List<Fankui> getAllFankui(){
       return fankuiMapper.getAllFankui();
    }

    @PostMapping(value = "update")
    public int update(@RequestBody Fankui fankui){
        return fankuiMapper.update(fankui);
    }

    @RequestMapping("/showFankuiId/{id}")
    public Fankui getById(@PathVariable("id") Integer id){
        return  fankuiMapper.getById(id);
    }
}
