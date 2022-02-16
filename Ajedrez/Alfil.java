package Ajedrez;

public class Alfil extends Figura{

	protected Alfil(boolean color) {
		super(color, new Casilla());
		this.id='A';
	}

	@Override
	public boolean moverse(Tablero t,char letra, int numero) {
		
		return false;
	}

}
