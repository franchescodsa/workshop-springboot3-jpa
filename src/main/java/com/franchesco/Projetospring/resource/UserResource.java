package com.franchesco.Projetospring.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping
	public ResponseEntity<User> insert(@RequestBody User obj) {
	    obj = service.insert(obj); // Chama o serviço para inserir o usuário
	    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
	            .buildAndExpand(obj.getId()).toUri(); // Cria a URI do recurso recém-criado
	    return ResponseEntity.created(uri).body(obj); // Retorna o objeto criado com status 201 (Created)
	}
	
	@DeleteMapping(value=  "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	}

