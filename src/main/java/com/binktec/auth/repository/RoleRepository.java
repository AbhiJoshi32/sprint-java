package com.binktec.auth.repository;

import org.springframework.data.repository.CrudRepository;
import com.binktec.auth.model.Role;

public interface RoleRepository extends CrudRepository<Role,Integer> {
    Role findByRoleName(String name);
}
