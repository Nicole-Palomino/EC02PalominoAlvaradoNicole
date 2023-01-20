package edu.zegel.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.zegel.pe.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{

}
