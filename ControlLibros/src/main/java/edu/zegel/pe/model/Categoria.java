package edu.zegel.pe.model;

import jakarta.persistence.*;

@Entity
@Table(name="categoria")
public class Categoria {
	@Id
	@Column(name="id")
	private int id;
	private String nombre;
	
	public Categoria(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Categoria() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
