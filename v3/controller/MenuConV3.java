package com.boot.sailing.v3.controller;

import com.boot.sailing.v3.service.MenuSvcV3;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/v3")
@Log4j2
public class MenuConV3 {

    @Autowired
    MenuSvcV3 menuSvc;

    @RequestMapping("/menu")
    public String doMenu(Model model){

        //Data 만들기 List , Map
        List<Map<String,Object>> list= menuSvc.doList();

        // Data 송부
        model.addAttribute("list",list);


        return "/v3/menu/menu";
    }
}
