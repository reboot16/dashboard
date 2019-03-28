package com.pa3.dashboard.services.impl;

import com.pa3.dashboard.models.entities.User;
import com.pa3.dashboard.repositories.RoleRepository;
import com.pa3.dashboard.repositories.UserRepository;
import com.pa3.dashboard.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getAllUserActive(boolean active) {
        return userRepository.findByActive(active);
    }

    @Override
    public List<User> getAllUserByRole(int roleId) {
        return userRepository.findByRole(roleId);
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User createUser(User user) {
        if(userRepository.existsById(user.getId()))
        {

        }

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
