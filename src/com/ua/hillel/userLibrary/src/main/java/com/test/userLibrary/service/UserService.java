package com.test.userLibrary.service;


import com.test.userLibrary.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user);

    boolean deleteUser(Long id);
}
