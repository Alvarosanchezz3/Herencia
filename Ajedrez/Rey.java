package Ajedrez;

public class Rey extends Figura{

	protected Rey(boolean color) {
		super(color, new Casilla());
		this.id='R';
	}

	@Override
	public boolean moverse(Tablero t,char letra, int numero) {
		
		return false;
	}

}
