package com.jjkj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jinxin on 2018/1/26.
 */
@RestController
@RequestMapping("/consumerDeptController")
public class ConsumerDeptController {

    public static final String DEPT_GETDEPTINFO_URL = "http://SPRINGCLOUD-PROVIDER-DEPT/deptRest/getDeptInfo";

    /**
     * 注入HttpHeaders
     */
    @Autowired
    private HttpHeaders httpHeaders;

    /**
     * 注入RestTemplate
     */
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getDeptInfo")
    public Object getDeptInfo() {
        Object object = this.restTemplate.exchange(DEPT_GETDEPTINFO_URL, HttpMethod.GET, new HttpEntity<Object>(this.httpHeaders), Object.class).getBody();
        return object;
    }

}
