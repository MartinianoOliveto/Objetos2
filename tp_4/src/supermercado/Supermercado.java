package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre; 
	private String direccion; 
	private List<Producto> productos = new ArrayList<Producto>(); 
	
	public int cantidadDeProductos() {
		return productos.size();
	}
	
	public Double precioTotal() {
		double total = 0; 
		for(Producto producto:productos) {
			total = total + producto.getPrecio();
		}
		return total; 
	}
	
}
