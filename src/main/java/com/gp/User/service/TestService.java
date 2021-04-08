package com.gp.User.service;

import com.gp.User.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
public interface TestService {
    List<Map<String,Object>>  testSelect ();

    Map test();
}
