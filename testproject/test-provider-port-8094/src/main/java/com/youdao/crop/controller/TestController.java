package com.youdao.crop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String getMessage(){
       return "I'm provider port 8094 !" ;
    }
}
