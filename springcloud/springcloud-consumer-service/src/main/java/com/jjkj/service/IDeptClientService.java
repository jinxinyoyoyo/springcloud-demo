package com.jjkj.service;

import com.jjkj.config.FeignClientConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jinxin on 2018/1/31.
 */
@FeignClient(value = "SPRINGCLOUD-ZUUL-GATEWAY", configuration = FeignClientConfig.class)
public interface IDeptClientService {

    @RequestMapping("/jjkj-proxy/dept-proxy/deptRest/getDeptInfo")
    public Object getDeptInfo();

}
