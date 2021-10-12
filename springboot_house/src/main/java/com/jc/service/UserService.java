package com.jc.service;

import com.jc.support.AccessResult;

public interface UserService {

    AccessResult createUser(String name, String password);
    AccessResult login(String name, String password);

}
