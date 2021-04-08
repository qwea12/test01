package com.gp.User.service;

import com.gp.User.dao.TestDao;
import com.gp.User.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("testServiceImpl")
public class TestServiceImpl implements TestService{
    @Autowired
    private TestDao testDao;
    @Override
    public List<Map<String, Object>> testSelect() {

        return testDao.testSelect();
    }

    @Override
    public Map test() {
        return testDao.test();
    }
}
