package com.clvs.seunggyu.service;

import com.clvs.seunggyu.dao.MemoryUserDao;
import com.clvs.seunggyu.dao.UserDao;
import com.clvs.seunggyu.model.User;

import java.util.Optional;

public class UserServiceImpl implements UserService{

    private final UserDao userDao = new MemoryUserDao();

    @Override
    public Optional<User> findUser(long seq) {
        return userDao.findUser(seq);
    }

    @Override
    public User addUser(User user) {
        return userDao.addUser(user);
    }
}
