package com.pa3.dashboard.services;

import com.pa3.dashboard.models.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUser();
    List<User> getAllUserActive(boolean active);
    List<User> getAllUserByRole(int roleId);

    Optional<User> getUserById(int id);

    User createUser(User user);
    User updateUser(int id, User user);

    void deleteUser(int id);
}
