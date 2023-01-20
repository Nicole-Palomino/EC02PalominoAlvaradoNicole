package edu.zegel.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import edu.zegel.pe.model.Libro;
import edu.zegel.pe.repository.LibroRepository;

@RestController
public class LibroController {
	@Autowired private LibroRepository data;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/libros")
	public List<Libro> getLibro(){
		return data.findAll();
	}
}
