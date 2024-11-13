package com.franchesco.Projetospring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.franchesco.Projetospring.entites.Order;
import com.franchesco.Projetospring.services.OrderServices;

@RestController // Indica que esta classe é um controlador REST, tornando possível expor métodos como endpoints de API
@RequestMapping(value = "/orders")//Define que todos os endpoints desta classe serão acessados com o caminho base /Orders
public class OrderResource {

	
	@Autowired
    private OrderServices service;
	
	@GetMapping //Indica que o método findAll será chamado em uma solicitação HTTP GET.
	public ResponseEntity<List<Order>> findAll() {
        List<Order> u = service.findAll();
        return ResponseEntity.ok().body(u);
    }
	
	@GetMapping(value=  "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
       Order obj = service.finById(id);
        return ResponseEntity.ok().body(obj);
    }
	}

