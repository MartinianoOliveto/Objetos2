package tp7;

public class Carta {
	private JerarquiaPoker valor; 
	private String palo; 
	
	public Carta(JerarquiaPoker n, String p) {
		this.valor = n; 
		this.palo = p; 
	}
	public JerarquiaPoker getValor() {
		return this.valor;
	}
	public String getPalo() {
		return this.palo; 
	}
	public boolean esMayor(Carta c) {
		return this.valor.compareTo(c.getValor()) > 0; 
	}
}
