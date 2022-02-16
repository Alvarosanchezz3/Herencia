package Ajedrez;

public class Torre extends Figura{

	protected Torre(boolean color) {
		super(color, new Casilla());
		this.id='T';
	}

	@Override
	public boolean moverse(Tablero t,char letra, int numero) {
		boolean res= false;
		String travieso="ABCDEFGH";
		if((letra == this.casillita.getLetra() && numero!= this.casillita.getNum())|| (letra!=this.casillita.getLetra() && numero==this.casillita.getNum())) {
			res=true;
			this.casillita.setPiecita(null);
			t.getTablerito().get(8 - numero).get(travieso.indexOf(letra)).setPiecita(this);
			this.casillita=t.getTablerito().get(8 - numero).get(travieso.indexOf(letra));
		}
		
		
		return res;
	}

}
