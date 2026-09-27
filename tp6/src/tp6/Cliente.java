package tp6;

public class Cliente {
	private String nombre; 
	private String apellido; 
	private int edad; 
	private double sueldoNetoMensual;
	
	public double sueldoNetoAnual() {
		return this.sueldoNetoMensual * 12; 
	}
	
	public double getSueldoNetoMensual() {
		return this.sueldoNetoMensual; 
	}
	
	public int getEdad() {
		return this.edad; 
	}

}
