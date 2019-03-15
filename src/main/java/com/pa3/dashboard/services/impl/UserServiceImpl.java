package com.pa3.dashboard.services.impl;

import com.pa3.dashboard.models.User;
import com.pa3.dashboard.repositories.UserRepository;
import com.pa3.dashboard.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public List<User> getAllUserActive() {
        return null;
    }

    @Override
    public List<User> getAllUserByRole(int roleId) {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(int id, User user) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
