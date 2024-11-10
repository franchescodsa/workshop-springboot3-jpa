package com.franchesco.Projetospring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.franchesco.Projetospring.entites.User;
import com.franchesco.Projetospring.services.UserServices;

@RestController // Indica que esta classe é um controlador REST, tornando possível expor métodos como endpoints de API
@RequestMapping(value = "/users")//Define que todos os endpoints desta classe serão acessados com o caminho base /users
public class UserResource {

	
	@Autowired
    private UserServices service;
	
	@GetMapping //Indica que o método findAll será chamado em uma solicitação HTTP GET.
	public ResponseEntity<List<User>> findAll() {
        List<User> u = service.findAll();
        return ResponseEntity.ok().body(u);
    }
	
	@GetMapping(value=  "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
       User obj = service.finById(id);
        return ResponseEntity.ok().body(obj);
    }
	}

