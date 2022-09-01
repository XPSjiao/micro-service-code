package com.ej.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: provide
 * @description:
 * @author: EthanJiao
 * @create: 2022-08-30
 **/
@RestController
@RequestMapping(value = "/api")
public class HelloController {
    @GetMapping("hello")
    public String getHello(){
        return "您好！我这里做出了更改了！";
    }
}
