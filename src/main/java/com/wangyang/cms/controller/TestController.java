package com.wangyang.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    /**
     *
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public List<String> hello2(){
        return Arrays.asList("1","2");
    }
}
