package com.crazy.myspringboot.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lizhiqiang
 */
@Getter
@Setter
public class User {


    private Long id;

    private String userName;

}
