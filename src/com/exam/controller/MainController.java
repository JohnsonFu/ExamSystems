package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by fulinhua on 2017/11/5.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/test.do",method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}