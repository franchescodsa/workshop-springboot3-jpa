package com.franchesco.Projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.franchesco.Projetospring.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
