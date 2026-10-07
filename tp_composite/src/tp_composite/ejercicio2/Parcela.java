package tp_composite.ejercicio2;

public class Parcela implements Cosechable{
	private Cultivo cultivo; 
	
	@Override 
	public int ganancia() {
		return this.cultivo.getValor(); 
	}
	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo; 
	}
	public Parcela(Cultivo c) {
		this.cultivo = c; 
	}
	
}
