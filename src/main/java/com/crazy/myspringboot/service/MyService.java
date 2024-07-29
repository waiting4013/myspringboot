package com.crazy.myspringboot.service;

import com.crazy.myspringboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lizhiqiang
 */
public interface MyService {


    /**
     * get
     * @return user
     */
    List<User> getUser();


}
