package tp5;

public class AgenciaRecaudadora implements Agencia{
	
	private String nombre;
	private String localidad; 
	
	//se le agrega comportamiento 
	public void registrarPago(Factura f) {
		f.pagarse();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getLocalidad() {
		return this.localidad;
	}
	
}
