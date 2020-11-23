package ups.edu.ec.modelo;

import java.io.Serializable;

public class Categoria implements Serializable {

	private String id;
	private String nombre;
	
	public void Categoria() {
		this.id=id;
		this.nombre=nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
