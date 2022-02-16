package Publicaciones;

public class Disco extends Prestable implements iPublicacion,iConsultable{
	protected boolean consultado;
	public Disco(String autor, String codigo, String titulo, int a�o) {
		super(autor,codigo,titulo,a�o);
	}
	@Override
	public void retirar() {
		if(!this.consultado && !this.prestado) {
			this.consultado=true;
		}
		
		
	}
	@Override
	public boolean estaConsultando() {
		// TODO Auto-generated method stub
		return this.consultado;
	}
	@Override
	public void devolver() {
		this.consultado=false;
		super.devolver();
	}
}
