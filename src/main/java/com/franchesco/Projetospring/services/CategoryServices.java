package com.franchesco.Projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franchesco.Projetospring.entites.Category;
import com.franchesco.Projetospring.repositories.CategoryRepository;

@Service /*
			 * A anotação @Service indica ao Spring que essa classe é um componente de
			 * serviço. Isso permite que ela seja gerenciada pelo Spring e injetada em
			 * outros componentes onde necessário.
			 */
public class CategoryServices {

	@Autowired
	/*
	 * Injeção de Dependência: Como você já fez,
	 * 
	 * @Autowired é usado para que o Spring injete automaticamente uma instância de
	 * CategoryRepository na classe CategoryServices.
	 */
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();

	}

	public Category finById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
