package com.boot.sailing.v3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderConV3 {

    @RequestMapping("/v3/order")
    public String doOrder(){

        return "/v3/order/order";
    }

}
