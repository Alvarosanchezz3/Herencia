package Publicaciones;

public abstract class Prestable extends Publicacion{
	protected boolean prestado;
	public Prestable(String autor, String codigo, String titulo, int a�o) {
		super(autor, codigo, titulo, a�o);
		this.prestado = false;
	}
	
	public void prestar() {
		this.prestado=true;
		
	}

	
	public void devolver() {
		this.prestado=false;
		
	}
	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

}
