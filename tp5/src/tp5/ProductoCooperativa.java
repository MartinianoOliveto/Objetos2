package tp5;

public class ProductoCooperativa extends Producto{
	private double descuento = 0.1; 
	
	public double getPrecio() {
		return this.precio - (this.precio * this.descuento); 
	}
	public ProductoCooperativa(String n, double p, int s) {
		super(n,p,s); 
	}
	
	public double getDescuento() {
		return this.descuento; 
	}
	public double precio() {
		return this.getPrecio(); 
	}
}


