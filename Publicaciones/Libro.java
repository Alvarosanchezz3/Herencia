package Publicaciones;

public class Libro extends Prestable implements iPublicacion,iPrestado,iConsultable{
	protected boolean consultado;
	public Libro(String autor, String codigo, String titulo, int año) {
		super(autor,codigo,titulo,año);
	}

	@Override
	public void retirar() {
		if(!this.consultado && !this.prestado) {
			this.consultado=true;
		}
		
		
	}

	@Override
	public boolean estaConsultando() {
		return this.consultado;
	}
	@Override
	public void devolver() {
		this.consultado=false;
		this.prestado=false;
	}
	@Override
	public void prestar() {
		if(!this.prestado && !this.consultado) {
			this.prestado=true;
		}
	}

	
}
