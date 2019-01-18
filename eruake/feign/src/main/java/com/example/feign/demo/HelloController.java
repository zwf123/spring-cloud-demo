/**
 * $Id: HelloController.java,v 1.0 2019/1/11 16:06 zhangwenfu Exp $
 * <p>
 * Copyright 2016 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package com.example.feign.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangwenfu
 * @version $Id: HelloController.java,v 1.1 2019/1/11 16:06 zhangwenfu Exp $
 * Created on 2019/1/11 16:06
 */
@RestController
public class HelloController {

    @Autowired
    private Consumer consumer;

    @GetMapping("/hello")
    public String sayHello() {
        return consumer.hello();
    }
}
