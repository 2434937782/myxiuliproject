package com.kgc.controller;

import com.kgc.pojo.Fankui;
import com.kgc.service.FankuiService;
import com.kgc.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class FankuiController {
    @Autowired
    private FankuiService fankuiService;

    //查询所有反馈
    @RequestMapping("/getAllFankui")
    public List<Fankui> getAllFankui(){
        return fankuiService.getAllFankui();
    }
    //回复用户反馈信息   修改的方式
    @RequestMapping("/update")
    public int update (Fankui fankui){
        return fankuiService.update(fankui);
    }
    //用户输入id查询反馈
    @RequestMapping("/getById")
    public Fankui getById(Integer id){

        return fankuiService.getById(id);
    }
}
