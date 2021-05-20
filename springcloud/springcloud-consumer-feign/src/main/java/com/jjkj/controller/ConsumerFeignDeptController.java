package com.jjkj.controller;

import com.jjkj.service.IDeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinxin on 2018/1/31.
 */
@RestController
@RequestMapping("/consumerFeignDeptController")
public class ConsumerFeignDeptController {

    @Autowired
    private IDeptClientService deptClintService;

    @RequestMapping("/getDeptInfo")
    public Object getDeptInfo() {
        return this.deptClintService.getDeptInfo();
    }

}
