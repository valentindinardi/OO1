package main;

public class Servicio extends Item {

	
	private double costoMaterial;
	private double costoUnitario;
	
	public Servicio(String descripcion, double costoMaterial, double costoUnitario) {
		this.descripcion = descripcion;
		this.costoMaterial = costoMaterial;
		this.costoUnitario = costoUnitario;
	}
	
	public double calcularCosto() {
		return costoMaterial + costoUnitario;
	}
}
