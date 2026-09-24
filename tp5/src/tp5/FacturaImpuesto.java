package tp5;

public class FacturaImpuesto extends Factura{
	private double valor; 
	
	
	@Override
	public double monto() {
		return this.getPrecio();
	}
	@Override 
	public double getPrecio() {
		return valor; 
	}

}
