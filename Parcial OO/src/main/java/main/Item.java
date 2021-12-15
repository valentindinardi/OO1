package main;

public abstract class Item {
	
	protected String descripcion;
	
	public abstract double calcularCosto();
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
