package com.crazy.myspringboot.dao;

import com.crazy.myspringboot.entity.User;

import java.util.List;

/**
 * @author lizhiqiang
 */
public interface MyDao {


    /**
     * get
     * @return user
     */
    List<User> get();

}
