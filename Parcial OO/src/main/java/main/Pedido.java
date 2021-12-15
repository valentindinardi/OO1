package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private String destino;
	private LocalDate fecha;
	private String empresa;
	private ArrayList<Item> items;

	public Pedido(String destino, LocalDate fecha, String empresa) {
		this.destino = destino;
		this.fecha = fecha;
		this.empresa = empresa;
		this.items = new ArrayList<Item>();
	}

	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularCostoBasico() {
		double total = 0;
		for (Item item : items) {
			total += item.calcularCosto();
		}
		return total;
	}

	
	public Factura facturar(LocalDate fechaExportacion) {
		Factura factura = new Factura(fechaExportacion,this.calcularCostoBasico());
		return factura;
	}
}
