package Publicaciones;

public abstract class Publicacion {
	protected String autor;
	protected String codigo;
	protected String titulo;
	protected int año;
	
	
	
	protected Publicacion(String autor, String codigo, String titulo, int año) {
		this.autor = autor;
		this.codigo = codigo;
		this.titulo = titulo;
		this.año = año;
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	
	
	
	
}
