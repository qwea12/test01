package com.gp.User.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface TestDao {
  List<Map<String,Object>> testSelect();

  public Map test();
}
