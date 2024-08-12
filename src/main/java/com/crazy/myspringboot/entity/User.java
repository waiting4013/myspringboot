package com.crazy.myspringboot.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lizhiqiang
 */
@Data
public class User {


    private Long id;

    private String userName;

}
