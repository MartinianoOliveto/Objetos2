package tp6;

public class CreditoPersonal extends SolicitudCredito{
	
	public CreditoPersonal(Cliente c, double m, int p) {
		super(c,m,p); 
	}
	
	public boolean esAceptable() {
		return cliente.sueldoNetoAnual()>= 15000 && this.cuotaMensual() <= cliente.getSueldoNetoMensual()*0.7; 
	}
}
