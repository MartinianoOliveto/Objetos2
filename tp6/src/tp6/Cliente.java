package tp6;

public class Cliente {
	private String nombre; 
	private int edad; 
	private double sueldoNetoMensual;
	
	public double sueldoNetoAnual() {
		return this.sueldoNetoMensual * 12; 
	}
	
	public double getSueldoNetoMensual() {
		return this.sueldoNetoMensual; 
	}
	//borrar si no se usa 
	public int getEdad() {
		return this.edad; 
	}
	
	public int edadEnAños(int n) {
		return this.edad + n; 
	}
	public Cliente(String n, int e, double s) {
		this.nombre =n; 
		this.edad = e; 
		this.sueldoNetoMensual = s; 
	}

}
