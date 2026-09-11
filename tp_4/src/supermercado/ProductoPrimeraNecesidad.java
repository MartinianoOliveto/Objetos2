package supermercado;

public class ProductoPrimeraNecesidad extends Producto{

	private Double descuento; 
	
	/*public ProductoPrimeraNecesidad(String n, Double p, Boolean b) {
		super(n,p,true); 
	}*/
	public ProductoPrimeraNecesidad(String n, Double p, Double d) {
		super(n,p); 
		descuento = d; 
	}
	@Override 
	public Double getPrecio() {
		return precioBase - this.calcularDescuento(); 
	}
	private Double calcularDescuento() {
		return (precioBase * descuento)/100; 
	}
}
