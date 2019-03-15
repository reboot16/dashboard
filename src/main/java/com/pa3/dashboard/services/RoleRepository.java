package com.pa3.dashboard.services;

import com.pa3.dashboard.models.Role;

import java.util.List;

public interface RoleRepository {

    Role getRoleById(int id);
    List<Role> getAllRole();

    Role createRole(Role role);
    Role updateRole(int id, Role role);
}
