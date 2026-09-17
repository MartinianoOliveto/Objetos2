package tp5;

public class Producto implements Costo {
	private Double precio; 
	private int stock; 
	
	public void descontarStock() {
		stock = stock -1; 
	}
	public Double getCosto() {
		return this.precio; 
	}
	private Double getPrecio() {
		
	}
	
}
