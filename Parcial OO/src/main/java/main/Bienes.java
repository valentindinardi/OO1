package main;

public class Bienes extends Item {

	private int unidades;
	private double peso;
	private double valorUnitario;

	public Bienes(String descripcion, int unidades, double peso, double valorUnitario) {
		this.descripcion = descripcion;
		this.unidades = unidades;
		this.peso = peso;
		this.valorUnitario = valorUnitario;
	}
	
	public double calcularCosto() {
		double costoBase = this.valorUnitario * this.unidades;
		if (this.peso * this.unidades > 1000) {
			return costoBase * 1.1;
		}
		else
			return costoBase;
	}
}
