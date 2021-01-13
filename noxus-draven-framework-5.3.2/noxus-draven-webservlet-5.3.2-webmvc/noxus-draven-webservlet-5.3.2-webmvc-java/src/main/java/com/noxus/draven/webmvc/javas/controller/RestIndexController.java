package com.noxus.draven.webmvc.javas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class RestIndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}

