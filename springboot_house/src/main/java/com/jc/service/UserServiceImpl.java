package com.jc.service;

import com.jc.dao.UserMapper;
import com.jc.entity.User;
import com.jc.support.AccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userDao;


    @Override
    public AccessResult createUser(String name, String password) {

        List<User> users = userDao.getUserByName(name);
        if (users.size() == 1) {

            return new AccessResult(-1, "该用户名已被使用！", null);
        }else {
            User user = new User();
            user.setName(name);
            user.setPassword(password);
            userDao.insertUser(user);
            Map<String, User> map = new HashMap<>();
            map.put("user", user);
            return new AccessResult(0, "注册成功！", map);
        }

    }

    @Override
    public AccessResult login(String name, String password) {

        User user = userDao.loginAndSelectUser(name,password);
        if (user != null){
            Map<String, User> map = new HashMap<>();
            map.put("user", user);
            return new AccessResult(0, "登录成功！", map);
        }else {
            return new AccessResult(-1, "用户名或密码错误！", null);
        }
    }
}
