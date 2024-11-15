package com.franchesco.Projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franchesco.Projetospring.entites.OrderItem;
import com.franchesco.Projetospring.entites.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
