package edu.zegel.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import edu.zegel.pe.model.Categoria;
import edu.zegel.pe.repository.CategoriaRepository;

@RestController
public class CategoriaController {
	@Autowired private CategoriaRepository data;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/categorias")
	public List<Categoria> getCategoria(){
		return data.findAll();
	}
}
