package com.pa3.dashboard.repositories;

import com.pa3.dashboard.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByActive();
    User findByEmail(String email);
}
