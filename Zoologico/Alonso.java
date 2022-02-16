package Zoologico;

public class Alonso extends Animales {

	private int nhijos;
	
	public Alonso(String reino, String familia,int nhijos) {
		super(reino, familia);
		this.setNhijos(nhijos);
	}

	@Override
	public void emitirSonido () {
		System.out.println("¿El infanta elena? Buen picadero");
	
	}

	public int getNhijos() {return nhijos;}

	public void setNhijos(int nhijos) {this.nhijos = nhijos;}	
	
}
