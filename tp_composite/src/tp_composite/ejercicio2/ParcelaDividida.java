package tp_composite.ejercicio2;

import java.util.ArrayList;
import java.util.List;



public class ParcelaDividida implements Cosechable{
	private List <Cosechable> parcelas = new ArrayList<Cosechable>();

	@Override
	public int ganancia() {
		// TODO Auto-generated method stub
		return parcelas.stream().mapToInt(c->c.ganancia()).sum(); 
	} 
	public void dividirParcela(Parcela p) {
		parcelas.add(p); 
	}

	
}
