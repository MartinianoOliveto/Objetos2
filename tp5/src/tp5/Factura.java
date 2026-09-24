package tp5;

public abstract class Factura implements Cobrable {
	protected Agencia agencia;  
	
	public Agencia getAgencia() {
		return agencia; 
	}
	public void registrar() {
		agencia.registrarPago(this);
	}
	public abstract double getPrecio(); 
	
}
