package com.franchesco.Projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franchesco.Projetospring.entites.Product;
import com.franchesco.Projetospring.repositories.ProductRepository;

@Service /*A anotação @Service indica ao Spring que essa classe é um componente de serviço. 
Isso permite que ela seja gerenciada pelo Spring e injetada em outros componentes onde necessário.*/
public class ProductServices {

	@Autowired
	/*Injeção de Dependência: Como você já fez, 
	 * @Autowired é usado para que o Spring injete automaticamente 
	 * uma instância de ProductRepository na classe ProductServices.*/
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
		
	}
	
	public Product finById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
	
}
