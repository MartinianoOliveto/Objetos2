package tp5;

public class FacturaServicio extends Factura{
	private double costoPorUnidad; 
	private double unidadesConsumidas; 
	
	@Override
	public double monto() {
		return this.getPrecio();
	}
	@Override 
	public double getPrecio() {
		return this.costoPorUnidad * this.unidadesConsumidas; 
	}
	
	

}
