package tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private List <Cobrable> costos = new ArrayList<Cobrable>(); 
	
	public double getMontoTotal() {
		return costos.stream().mapToDouble(c->c.monto()).sum(); //esto podria ser private  
	}
	public void registrarProductos() {
		costos.stream().forEach(c -> c.registrar()); //esto podria ser private  
	}
	public double pasarPorCaja() {
		this.registrarProductos();
		return this.getMontoTotal(); 
	}
	public void agregarACaja(Cobrable c) {
		costos.add(c); 
	}
	
	
}
//implementar una interfaz cobrable, y una clase abstracta de las que van a heredar factura y servicio  