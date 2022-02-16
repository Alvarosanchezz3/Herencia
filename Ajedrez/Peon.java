package Ajedrez;

public class Peon extends Figura{

	protected Peon(boolean color) {
		super(color, new Casilla());
		this.id='P';
	}

	@Override
	public boolean moverse(Tablero t,char letra, int numero) {
		
		return false;
	}

}
