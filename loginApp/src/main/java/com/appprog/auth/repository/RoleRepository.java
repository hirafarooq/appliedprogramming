package com.appprog.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appprog.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
