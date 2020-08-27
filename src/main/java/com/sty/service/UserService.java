package com.sty.service;

import com.sty.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 查所有
     */
    public List<User> findAll();
}
