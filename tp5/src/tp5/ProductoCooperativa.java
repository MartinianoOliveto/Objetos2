package tp5;

public class ProductoCooperativa extends Producto{
	private double descuento = 0.1; 
	
	public double getPrecio() {
		return this.precio - (this.precio * this.descuento); 
	}
}


