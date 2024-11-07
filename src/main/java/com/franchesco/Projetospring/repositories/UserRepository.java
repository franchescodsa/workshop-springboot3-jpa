package com.franchesco.Projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franchesco.Projetospring.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
