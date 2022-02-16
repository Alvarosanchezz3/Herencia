package Publicaciones;

public class Revista extends Publicacion implements iPublicacion,iConsultable{
	protected boolean consultado;
	public Revista(String autor, String codigo, String titulo, int año) {
		super(autor,codigo,titulo,año);
	}
	@Override
	public void retirar() {
			this.consultado=true;
		
		
		
	}
	@Override
	public void devolver() {
		this.consultado=false;
		
	}
	@Override
	public boolean estaConsultando() {
		return this.consultado;
	}

}
