package com.crazy.myspringboot.dao;

import com.crazy.myspringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
