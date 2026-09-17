package tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private List <Costo> costos = new ArrayList<Costo>(); 
	
	public double getMontoTotal() {
		return costos.stream().mapToDouble(c->c.getCosto()).sum(); 
	}
	public void registrarProductos() {
		costos.stream().forEach(c -> c.registrar()); 
	}
	
}
//implementar una interfaz cobrable, y una clase abstracta de las que van a heredar factura y servicio  