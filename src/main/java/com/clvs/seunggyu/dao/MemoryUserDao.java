package com.clvs.seunggyu.dao;

import com.clvs.seunggyu.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MemoryUserDao implements UserDao {

    private static Map<Long, User> add = new HashMap<>(); // 동시성 문제가 있을 수 있어 실무에서는 공유되는 변수 일 때는 ConcurrentHashMap 사용해야한다.
    private static long sequence = 0L;

    @Override
    public Optional<User> findUser(long seq) {
        return Optional.empty();
    }

    @Override
    public User addUser(User user) {
        user.setSeq(++sequence);
        add.put(user.getSeq(), user);
        System.out.println("addMap : " + add);
        return user;
    }
}
