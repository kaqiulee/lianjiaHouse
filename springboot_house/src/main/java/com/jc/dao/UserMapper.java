package com.jc.dao;

import com.jc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    List<User> getUserByName(String name);
    int insertUser(User user);
    User loginAndSelectUser(@Param("name")String name, @Param("password")String password);

}
