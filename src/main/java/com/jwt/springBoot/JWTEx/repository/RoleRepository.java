package com.jwt.springBoot.JWTEx.repository;

import com.jwt.springBoot.JWTEx.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
    boolean existsByRoleNameIgnoreCase(String roleName);
}
