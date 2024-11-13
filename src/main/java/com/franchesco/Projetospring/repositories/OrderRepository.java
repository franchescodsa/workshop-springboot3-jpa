package com.franchesco.Projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franchesco.Projetospring.entites.Order;

public interface OrderRepository extends JpaRepository<	Order, Long>{

}
