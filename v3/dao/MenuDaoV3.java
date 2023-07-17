package com.boot.sailing.v3.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuDaoV3 {
    List<Map<String, Object>> doList();
}
