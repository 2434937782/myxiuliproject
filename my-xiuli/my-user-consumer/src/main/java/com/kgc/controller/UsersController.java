package com.kgc.controller;

import com.kgc.pojo.Dingdan;
import com.kgc.service.DingdanService;
import com.kgc.service.GoodService;
import com.kgc.service.UserService;
import com.kgc.service.YouhuiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private DingdanService dingdanService;
    @Autowired
    private GoodService goodService;
    @Autowired
    private UserService userService;
    @Autowired
    private YouhuiService youhuiServiceu;

    @RequestMapping("/getAllDingdan")
    public List<Dingdan> getAllDept() {
        return dingdanService.getdingdan();
    }


}
