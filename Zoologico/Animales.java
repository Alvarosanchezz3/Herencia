package Zoologico;

public abstract class Animales {

	protected String reino;
	protected String familia;
	
	// Constructor //
	
	public Animales(String reino, String familia) {
		super();
		this.reino = reino;
		this.familia = familia;
	}

	// Getters and Setters //
	
	public String getReino() {return reino;}
	public void setReino(String reino) {this.reino = reino;}

	public String getFamilia() {return familia;}
	public void setFamilia(String familia) {this.familia = familia;}
	
	public abstract void emitirSonido ();
	
	public void morirse () {
		System.out.println("Me he muerto");
	}
}

