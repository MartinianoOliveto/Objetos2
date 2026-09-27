package tp6;

public class SolicitudCreditoHipotecario extends SolicitudCredito{
	
	private Propiedad garantia; 
	
	@Override 
	public boolean esAceptable() {
		return this.cuotaMensual() <= cliente.getSueldoNetoMensual() && this.montoSolicitado <= garantia.getValorFiscal() * 0.7 && cliente.getEdad() <= 65; 
	}
	
	public SolicitudCreditoHipotecario(Cliente c, double m, int p, Propiedad g) {
		super(c,m,p); 
		this.garantia = g; 
	}
	
	public Propiedad getGarantia() {
		return this.garantia; 
	}
}
