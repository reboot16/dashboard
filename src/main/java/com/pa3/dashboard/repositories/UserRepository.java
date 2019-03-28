package com.pa3.dashboard.repositories;

import com.pa3.dashboard.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByActive(boolean active);
    List<User> findByRole(int roleId);
    User findByEmail(String email);
}
