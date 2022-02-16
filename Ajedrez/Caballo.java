package Ajedrez;

public class Caballo extends Figura{

	protected Caballo(boolean color) {
		super(color, new Casilla());
		this.id='C';
	}

	@Override
	public boolean moverse(Tablero t,char letra, int numero) {
		
		return false;
	}

}
