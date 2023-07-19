package com.boot.sailing.v3.service;

import com.boot.sailing.v3.dao.MenuDaoV3;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Log4j2
public class MenuSvcV3 {

    @Autowired
    MenuDaoV3 menuDao;

    //Dao에 연동시켜서 뷰로 데이터 전송
    public List<Map<String,Object>> doList(){

        //Data 만들기 List , Map
        List<Map<String,Object>> list=menuDao.doList();

        log.info(list);

        return list;
    }

    //List,Map 이용하여 수동으로 데이터 뷰로 전송
    public List<Map<String,Object>> doListOld(){

        //Data 만들기 List , Map
        List<Map<String,Object>> list=new ArrayList<>();

        Map<String,Object> map=new HashMap<>();

        map.put("No","1");
        map.put("name","Lazio Home Kit(2023-2024)");
        map.put("kind","유니폼");
        map.put("price","150,000");
        map.put("reg_day","2022.07.17");
        map.put("mod_day","2023.07.17");
        list.add(map);

        Map<String,Object> map2=new HashMap<>();

        map2.put("No","2");
        map2.put("name","Lazio Away Kit(2023-2024)");
        map2.put("kind","유니폼");
        map2.put("price","145,000");
        map2.put("reg_day","2022.09.30");
        map2.put("mod_day","2023.07.17");
        list.add(map2);

        Map<String,Object> map3=new HashMap<>();

        map3.put("No","3");
        map3.put("name","Luis Alberto Soccer Shoes");
        map3.put("kind","축구용품");
        map3.put("price","317,000");
        map3.put("reg_day","2023.02.14");
        map3.put("mod_day","2023.07.17");
        list.add(map3);

        log.info(list);

        return list;

    }

    public int doInsert(String strProduct, String strKind, String strPrice) {

        int i = menuDao.doInsert(strProduct,strKind,strPrice);

        return i;
    }

    public int doDelete(String strNo) {

        int i=menuDao.doDelete(strNo);

        return i;
    }

    //One row 조회
    public Map<String, Object> doListOne(String strNo) {

        Map<String,Object> map = menuDao.doListOne(strNo);

        return map;
    }

    // Update
    public int doUpdate(String strNo, String strProduct, String strKind, String strPrice) {

        int i = menuDao.doUpdate(strNo,strProduct,strKind,strPrice);

        return i;
    }
}