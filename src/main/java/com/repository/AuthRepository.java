package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Auth;

public interface AuthRepository extends JpaRepository<Auth, Long>{
    
}
