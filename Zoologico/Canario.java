package Zoologico;

public class Canario extends Animales implements Cantante {
	public String nombre;
	
	public Canario(String reino, String familia,String nombre) {
		super(reino, familia);
		this.nombre=nombre;
	}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	@Override
	public void cantar() {
		System.out.println("Arranca leo por la derecha");
	}

	@Override
	public void emitirSonido() {
		System.out.println("Pio pio ");
		
	}

}
