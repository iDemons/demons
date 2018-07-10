package com.tqh.demo.service;

/**
 * @program: demo
 * @description:
 * @author: Demons
 * @create: 2018-07-08 09:43
 */

import com.tqh.demo.mapper.UserMapper;
import com.tqh.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;


public class UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public Person selectUser(int id) {
        return userMapper.selectUser(id);
    }

}