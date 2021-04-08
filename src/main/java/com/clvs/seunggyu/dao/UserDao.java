package com.clvs.seunggyu.dao;

import com.clvs.seunggyu.model.User;

import java.util.Optional;

public interface UserDao {
//    User findUser(long seq);
    Optional<User> findUser(long seq);

    User addUser(User user);

}
