package com.clvs.seunggyu.service;

import com.clvs.seunggyu.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findUser(long seq);

    User addUser(User user);
}
