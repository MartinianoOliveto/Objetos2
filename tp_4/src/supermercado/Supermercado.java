package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre; 
	private String direccion; 
	private List<Producto> productos = new ArrayList<Producto>(); 
	
	public Supermercado(String n, String d) {
		nombre = n; 
		direccion = d;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	public void agregarProducto(Producto p) {
		productos.add(p);
	}
	
	
	public Double getPrecioTotal() {
		double total = 0; 
		for(Producto producto:productos) {
			total = total + producto.getPrecio();
		}
		return total; 
		
	}
	
}
