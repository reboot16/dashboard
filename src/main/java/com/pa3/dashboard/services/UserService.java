package com.pa3.dashboard.services;

import com.pa3.dashboard.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
    List<User> getAllUserActive();
    List<User> getAllUserByRole(int roleId);

    User getUserById(int id);

    User createUser(User user);
    User updateUser(int id, User user);

    void deleteUser(int id);
}
