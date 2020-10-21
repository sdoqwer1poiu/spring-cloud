package com.atguigu.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigClientController
 * @Description TODO
 * @Author YH
 * @Date 2020/10/11 15:49
 * @Version 1.0
 */
@RestController
@RefreshScope //动态刷新配置
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo; //使用nacos作为配置中心后，可以这样直接从nacos上拉取值，为什么是动态刷新，因为后面直接在nacos上更改编辑，都不用改代码，获取的内容也会自动改变

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
