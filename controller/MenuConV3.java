package com.boot.sailing.v3.controller;

import com.boot.sailing.v3.service.MenuSvcV3;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    //등록버튼 누를시 등록화면 띄우기
    @GetMapping("/menu_ins")
    public String doInsert(){
        return "/v3/menu/menu_ins";
    }

    //등록버튼 누를시 데이터 뷰에 송부
    @PostMapping("/menu_ins")
    public String doInsertPost(@RequestParam("product") String strProduct,
                               @RequestParam("kind") String strKind,
                               @RequestParam("price") String strPrice
    ){

        int i = menuSvc.doInsert(strProduct,strKind,strPrice);

        return "redirect:/v3/menu";
    }

    //삭제 기능
    @GetMapping("/menu_del")
    public String doDelete(@RequestParam("no") String strNo){

        log.info("strNo: "+strNo);

        int i=menuSvc.doDelete(strNo);

        return "redirect:/v3/menu";
    }

    @GetMapping("/menu_up")
    public String doUpdate(Model model,
                           @RequestParam("no") String strNo){

        Map<String,Object> map = menuSvc.doListOne(strNo);
        model.addAttribute("map",map);

        return "/v3/menu/menu_up";
    }

    //수정버튼 누를시 데이터 뷰에 송부
    @PostMapping("/menu_up")
    public String doUpdatePost(@RequestParam("no") String strNo,
                               @RequestParam("product") String strProduct,
                               @RequestParam("kind") String strKind,
                               @RequestParam("price") String strPrice
    ){

        int i = menuSvc.doUpdate(strNo,strProduct,strKind,strPrice);

        return "redirect:/v3/menu";
    }
}
