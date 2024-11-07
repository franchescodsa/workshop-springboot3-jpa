package com.franchesco.Projetospring.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.franchesco.Projetospring.entites.User;

@RestController // Indica que esta classe é um controlador REST, tornando possível expor métodos como endpoints de API
@RequestMapping(value = "/users")//Define que todos os endpoints desta classe serão acessados com o caminho base /users
public class UserResource {

	@GetMapping //Indica que o método findAll será chamado em uma solicitação HTTP GET.
	public ResponseEntity<User> findAll() {

		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);

	}
}
