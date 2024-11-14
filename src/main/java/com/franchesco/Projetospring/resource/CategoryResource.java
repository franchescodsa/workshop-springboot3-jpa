package com.franchesco.Projetospring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.franchesco.Projetospring.entites.Category;
import com.franchesco.Projetospring.services.CategoryServices;

@RestController // Indica que esta classe é um controlador REST, tornando possível expor métodos como endpoints de API
@RequestMapping(value = "/categories")//Define que todos os endpoints desta classe serão acessados com o caminho base /Categorys
public class CategoryResource {

	
	@Autowired
    private CategoryServices service;
	
	@GetMapping //Indica que o método findAll será chamado em uma solicitação HTTP GET.
	public ResponseEntity<List<Category>> findAll() {
        List<Category> u = service.findAll();
        return ResponseEntity.ok().body(u);
    }
	
	@GetMapping(value=  "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
       Category obj = service.finById(id);
        return ResponseEntity.ok().body(obj);
    }
	}

