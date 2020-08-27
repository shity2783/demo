package com.sty.service;

import com.sty.dao.UserDao;
import com.sty.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 用户查所有
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        //调用dao层查所有方法
        List<User> users = userDao.findAll();
        return users;
    }
}
