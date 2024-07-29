package com.crazy.myspringboot.service.serviceImpl;

import com.crazy.myspringboot.dao.MyDao;
import com.crazy.myspringboot.entity.User;
import com.crazy.myspringboot.service.MyService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lizhiqiang
 */
@Service
public class MyServiceImpl implements MyService {
    @Resource
    MyDao myDao;

    @Override
    public List<User> getUser() {
        List<User> user = myDao.get();
        return user;
    }
}
