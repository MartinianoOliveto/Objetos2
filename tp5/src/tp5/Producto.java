package tp5;

public class Producto implements Cobrable {
	private String nombre; 
	protected double precio; 
	private int stock; 
	
	public void registrar() {
		this.descontarStock(); 
	}
	
	private void descontarStock() {
		stock = stock -1; 
	}
	public double monto() {
		return this.precio; 
	}
	public Producto(String n, double p, int s){
		this.nombre = n; 
		this.precio = p; 
		this.stock = s; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	public double getPrecio() {
		return this.precio; 
	}
	public int getStock() {
		return this.stock; 
	}
	
}
