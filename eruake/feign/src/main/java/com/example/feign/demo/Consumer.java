/**
 * $Id: Consumer.java,v 1.0 2019/1/11 16:02 zhangwenfu Exp $
 * <p>
 * Copyright 2016 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package com.example.feign.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangwenfu
 * @version $Id: Consumer.java,v 1.1 2019/1/11 16:02 zhangwenfu Exp $
 * Created on 2019/1/11 16:02
 */
@FeignClient("hello-world")
public interface Consumer {
    @GetMapping("/hello")
    public String hello();
}
