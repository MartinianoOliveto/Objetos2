package tp_composite.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private List <Cosechable> parcelas = new ArrayList<Cosechable>(); 
	
	public int totalGanancias() {
		return parcelas.stream().mapToInt(c->c.ganancia()).sum();
	}
	public void agregarParcela(Cosechable p) {
		parcelas.add(p); 
	}
}
