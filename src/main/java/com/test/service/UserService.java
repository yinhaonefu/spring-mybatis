package com.test.service;

import com.test.model.User;

import java.util.List;

/**
 * Created by yinhao on 17/8/5.
 */
public interface UserService {

    void save(User user);
    boolean update(User user);
    boolean delete(int id);
    User findById(int id);
    List<User> findAll();

}
