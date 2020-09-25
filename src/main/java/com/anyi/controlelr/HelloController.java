package com.anyi.controlelr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anyi")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "你好，星星 ~~";
    }
}
