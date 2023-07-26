package com.boot.sailing.v3.dao;

import com.boot.sailing.v3.vo.Cust_info2;
import com.boot.sailing.v3.vo.Order_list2;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDaoV3 {

    List<Cust_info2> doList();

    List<Cust_info2> doSearch(String strStartDate, String strEndDate, String strName);
}
