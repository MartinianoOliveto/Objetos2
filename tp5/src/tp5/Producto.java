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
	public double getPrecio() {
		return this.precio; 
	}
}
