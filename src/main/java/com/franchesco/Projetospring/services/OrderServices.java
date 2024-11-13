package com.franchesco.Projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franchesco.Projetospring.entites.Order;
import com.franchesco.Projetospring.repositories.OrderRepository;


@Service /*A anotação @Service indica ao Spring que essa classe é um componente de serviço. 
Isso permite que ela seja gerenciada pelo Spring e injetada em outros componentes onde necessário.*/
public class OrderServices {

	@Autowired
	/*Injeção de Dependência: Como você já fez, 
	 * @Autowired é usado para que o Spring injete automaticamente 
	 * uma instância de OrderRepository na classe OrderServices.*/
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
		
	}
	
	public Order finById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
	
}
