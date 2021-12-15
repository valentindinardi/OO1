package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServicioExportacion {

	private List<Pedido> pedidos = new ArrayList<Pedido>();
	private List<Factura> facturas = new ArrayList<Factura>();

	public Pedido generarPedido(String destino, LocalDate fecha, String empresa) {
		Pedido pedido = new Pedido(destino, fecha, empresa);
		pedidos.add(pedido);
		return pedido;
	}

	public void añadirBienes(Pedido pedido, String descripcion, int unidades, double peso, double valorUnitario) {
		pedido.agregarItem(new Bienes(descripcion, unidades, peso, valorUnitario));
	}

	public void añadirServicio(Pedido pedido, String descripcion, double costoMaterial, double costoManoDeObra) {
		pedido.agregarItem(new Servicio(descripcion, costoMaterial, costoManoDeObra));
	}
	
	public Factura obtenerFacturaConMayorCosto(LocalDate fechaIni, LocalDate fechaFin) {
			double maxCostoFinal = 0;
			Factura maxFactura = null;
			DateLapse datelapse = new DateLapse(fechaIni,fechaFin);
			for (Factura factura : facturas) {
				if (datelapse.includesDate(factura.getFechaExportacion()) && factura.getCostoFinal() > maxCostoFinal){
					maxCostoFinal = factura.getCostoFinal();
					maxFactura = factura;
				}
				
			}
			return maxFactura;
	}
}
