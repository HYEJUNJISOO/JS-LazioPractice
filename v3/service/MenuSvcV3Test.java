package com.boot.sailing.v3.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MenuSvcV3Test {

    @Autowired
    MenuSvcV3 menuSvcV3;

    @Test
    void doUpdateInsert() {
        List<String> chkList = new ArrayList<>();
        chkList.add("1");
        chkList.add("2");

        String strPrice="2222";

        menuSvcV3.doUpdateInsert(chkList,strPrice);
    }
}