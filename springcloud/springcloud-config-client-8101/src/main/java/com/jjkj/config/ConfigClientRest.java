package com.jjkj.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinxin on 2018/2/6.
 */
@RestController
@RequestMapping("/configClientRest")
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @RequestMapping("/getConfig")
    public String getConfig() {
        return "applicationName=" + this.applicationName + "|eurekaServers=" + this.eurekaServers;
    }
}
