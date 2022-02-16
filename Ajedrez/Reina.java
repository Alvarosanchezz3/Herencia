package Ajedrez;

public class Reina extends Figura{

	protected Reina(boolean color) {
		super(color, new Casilla());
		this.id='D';
	}

	@Override
	public boolean moverse(Tablero t,char letra, int numero) {
		
		return false;
	}

}
