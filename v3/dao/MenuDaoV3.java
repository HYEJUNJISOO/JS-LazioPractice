package com.boot.sailing.v3.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuDaoV3 {

    List<Map<String, Object>> doList();

    int doInsert(String strProduct, String strKind, String strPrice);

    int doDelete(String strNo);

    //One row 조회
    Map<String, Object> doListOne(String strNo);

    // Update
    int doUpdate(String strNo, String strProduct, String strKind, String strPrice);

    // Search
    List<Map<String, Object>> doSearch(String strStartDate, String strEndDate, String strProduct, String strKind);
}
