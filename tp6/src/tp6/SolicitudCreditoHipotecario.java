package tp6;

public class SolicitudCreditoHipotecario extends SolicitudCredito{
	
	private Propiedad garantia; 
	
	@Override 
	public boolean esAceptable() {
		return this.cuotaMensual() <= cliente.getSueldoNetoMensual() * 0.5 && this.montoSolicitado <= garantia.getValorFiscal() * 0.7 && cliente.edadEnAños(this.plazo/12) <= 65; 
	}
	
	public SolicitudCreditoHipotecario(Cliente c, double m, int p, Propiedad g) {
		super(c,m,p); 
		this.garantia = g; 
	}
	
	public Propiedad getGarantia() {
		return this.garantia; 
	}
}
