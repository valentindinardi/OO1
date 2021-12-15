package main;

import java.time.LocalDate;

public class Factura {

	private LocalDate fechaFacturacion;
	private LocalDate fechaExportacion;
	private double costoBasico;
	private double costoFinal;
	private double costoExportacion;

	public Factura(LocalDate fechaExportacion,double costoBasico) {
		this.fechaFacturacion = LocalDate.now();
		this.fechaExportacion = fechaExportacion;
		this.costoBasico = costoBasico;
		this.costoExportacion = costoBasico * 0.05;
		this.costoFinal = costoBasico + this.costoExportacion;
	}

	public LocalDate getFechaFacturacion() {
		return fechaFacturacion;
	}

	public LocalDate getFechaExportacion() {
		return fechaExportacion;
	}

	public double getCostoBasico() {
		return costoBasico;
	}

	public double getCostoFinal() {
		return costoFinal;
	}

	public double getCostoExportacion() {
		return costoExportacion;
	}
	
}
