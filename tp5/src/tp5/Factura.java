package tp5;

public abstract class Factura implements Cobrable {
	protected Agencia agencia;  
	protected boolean estaPago = false; 
	
	public Agencia getAgencia() {
		return agencia; 
	}
	public void registrar() {
		agencia.registrarPago(this);
	}
	public abstract double getPrecio(); 
	
	public void pagarse() {
		this.estaPago = true; 
	}
	//Esto es para testear que funcione nomas 
	 public boolean estaPago() {
		 return this.estaPago; 
	 }
	
}
