package edu.zegel.pe.model;

import jakarta.persistence.*;

@Entity
@Table(name="libro")
public class Libro {
	@Id
	@Column(name="id")
	private int id;
	private String nombre;
	private String cat;
	private int anio;
	private String editorial;
	private int pag;
	private Double precio;
	
	public Libro(int id, String nombre, String cat, int anio, String editorial, int pag, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cat = cat;
		this.anio = anio;
		this.editorial = editorial;
		this.pag = pag;
		this.precio = precio;
	}
	
	public Libro() {
		
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

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPag() {
		return pag;
	}

	public void setPag(int pag) {
		this.pag = pag;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
