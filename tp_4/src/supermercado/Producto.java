package supermercado;

public class Producto {
	private Double precioBase; 
	private String nombre; 
	private Boolean esPrecioCuidado; 
	

	public String getNombre() {
		return nombre; 
	}
	public Double getPrecio() {
		return precioBase; 
	}
	public Boolean esPrecioCuidado() {
		return esPrecioCuidado; 
	}
	
	public Producto(String n, Double p) {
		precioBase = p; 
		nombre = n; 
		esPrecioCuidado = false; 
	}
	public Producto(String n, Double p, Boolean b) {
		precioBase = p; 
		nombre = n; 
		esPrecioCuidado = b;
	}
	public void aumentarPrecio(Double p) {
		precioBase = precioBase + p; 
	}

}
