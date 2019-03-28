package com.pa3.dashboard.services.impl;

import com.pa3.dashboard.Exceptions.ResourceNotFoundException;
import com.pa3.dashboard.models.ErrorCode;
import com.pa3.dashboard.models.entities.Role;
import com.pa3.dashboard.repositories.RoleRepository;
import com.pa3.dashboard.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;


public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;


    @Override
    public Role getRoleByName(String name) {
        if(!roleRepository.existsByRole(name))
        {
            throw new ResourceNotFoundException(ErrorCode.NOT_FOUND.getMessage(), ErrorCode.NOT_FOUND.getCode());
        }

        return roleRepository.findByRole(name);
    }
}
