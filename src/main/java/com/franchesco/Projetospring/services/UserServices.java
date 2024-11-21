package com.franchesco.Projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franchesco.Projetospring.entites.User;
import com.franchesco.Projetospring.repositories.UserRepository;

@Service /*A anotação @Service indica ao Spring que essa classe é um componente de serviço. 
Isso permite que ela seja gerenciada pelo Spring e injetada em outros componentes onde necessário.*/
public class UserServices {

	@Autowired
	/*Injeção de Dependência: Como você já fez, 
	 * @Autowired é usado para que o Spring injete automaticamente 
	 * uma instância de UserRepository na classe UserServices.*/
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
		
	}
	
	public User finById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	//Inseri no banco de dados
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	//Deleta banco dados
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	//Atualizar usuario
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
	

	
	
}
