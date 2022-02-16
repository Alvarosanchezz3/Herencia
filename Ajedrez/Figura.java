package Ajedrez;

public abstract class Figura {
	protected boolean color;
	protected char id;
	protected Casilla casillita;
	
	
	protected Figura(boolean color, Casilla casillita) {
		this.color = color;
		this.casillita = casillita;
	}
	
	
	public boolean isColor() {
		return color;
	}
	public void setColor(boolean color) {
		this.color = color;
	}
	public char getId() {
		return id;
	}
	public void setId(char id) {
		this.id = id;
	}
	public Casilla getCasillita() {
		return casillita;
	}
	public void setCasillita(Casilla casillita) {
		this.casillita = casillita;
	}
	
	@Override
	public String toString() {
		return Character.toString(this.id);
	}
	
	public abstract boolean moverse(Tablero t,char letra, int numero);
	
	
	
	
	
	
	
}
