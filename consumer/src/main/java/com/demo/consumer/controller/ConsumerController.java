/**
 * Project Name : com.demo.springcloud
 * File Name    : Consumer
 * Package Name : com.demo.consumer.controller
 * Date         : 2020-07-20 17:07
 * Author       : jbz
 * Copyright (c) 2019, jiang.baozi@ustcinfo.com All Rights Reserved.
 */
package com.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName : Consumer
 * @author : jbz
 * @Date : 2020-07-20 17:07
 * @Description :   
 */

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/con",method = RequestMethod.GET)
    public String helloConsumer(){
        //获取到服务提供者的 hello 接口
        return restTemplate.getForEntity("http://hello-service/hello",String.class).getBody();
    }
}