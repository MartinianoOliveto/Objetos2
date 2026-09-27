package tp6;

public abstract class SolicitudCredito {
	protected Cliente cliente; 
	protected double montoSolicitado; 
	protected int plazo; 
	
	public abstract boolean esAceptable(); 
	
	public double cuotaMensual() {
		return this.montoSolicitado / this.plazo; 
	}
	
	public SolicitudCredito(Cliente c, double m, int p) {
		this.cliente = c; 
		this.montoSolicitado = m; 
		this.plazo = p; 
	}
	
	public Cliente getCliente() {
		return this.cliente; 
	}
	
	public double getMontoSolicitado() {
		return this.montoSolicitado; 
	}
	
	public int getPlazo() {
		return this.plazo; 
	}
	
}
