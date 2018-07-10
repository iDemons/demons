package com.tqh.demo.mapper;

import com.tqh.demo.model.Person;
import org.apache.ibatis.annotations.Select;

/**
 * @program: demo
 * @description:
 * @author: Demons
 * @create: 2018-07-08 09:26
 */

public interface UserMapper {
        <br>　　
    @Select("SELECT * FROM person WHERE id = #{id}") <br>　　

    Person selectUser(int id); <br>
}<br>
