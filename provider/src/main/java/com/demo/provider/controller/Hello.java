/**
 * Project Name : com.demo.springcloud
 * File Name    : Hello
 * Package Name : com.demo.provider.controller
 * Date         : 2020-07-20 16:45
 * Author       : jbz
 * Copyright (c) 2019, jiang.baozi@ustcinfo.com All Rights Reserved.
 */
package com.demo.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : Hello
 * @author : jbz
 * @Date : 2020-07-20 16:45
 * @Description :   
 */

@RestController
public class Hello {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "你好,这里是服务提供者，提供了hello服务";
    }

}