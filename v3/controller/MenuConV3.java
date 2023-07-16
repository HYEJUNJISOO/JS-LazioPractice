package com.boot.sailing.v3.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v3")
@Log4j2
public class MenuConV3 {

    @RequestMapping("/menu")
    public String doMenu(){

        return "/v3/menu/menu";
    }
}
