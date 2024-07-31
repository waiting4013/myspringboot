package com.crazy.myspringboot.controller;

import com.crazy.myspringboot.entity.User;
import com.crazy.myspringboot.service.MyService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lizhiqiang
 */
@RestController
@RequestMapping("/books")
public class MyController {
    @Resource
    MyService myService;

    @RequestMapping("/{id}")
    public void user(@PathVariable Integer id) {
        System.out.println(id);
        List<User> user = myService.getUser();


    }
}
