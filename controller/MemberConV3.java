package com.boot.sailing.v3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberConV3 {

    @RequestMapping("/v3/member")
    public String doMember(){

        return "/v3/member/member";
    }
}
