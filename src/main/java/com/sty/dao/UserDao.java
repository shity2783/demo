package com.sty.dao;

import com.sty.entity.User;

import java.util.List;

public interface UserDao {

    /**
     * 查所有
     */
    public List<User> findAll();
}
