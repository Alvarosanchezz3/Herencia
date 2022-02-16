package Escuela;

import java.util.ArrayList;

public class Estudiante extends Persona{
	
	private double notaMedia;
	private ArrayList<Asignatura> asignatura;
	
	public Estudiante() {
		super();
		this.notaMedia=0;
		this.asignatura=new ArrayList<Asignatura>();
	}
	
	public Estudiante(String nombre, String dni, double notaMedia) {
		super(nombre,dni);
		this.notaMedia=notaMedia;
		this.asignatura=new ArrayList<Asignatura>();
	}
	
	// GETTERS AND SETTERS //
	
	public double getNotaMedia() {return this.notaMedia;}
	public void setNotaMedia(double notaMedia) {this.notaMedia = notaMedia;}
	
	public ArrayList<Asignatura> getAsignatura() {return this.asignatura;}
	public void setAsignatura(ArrayList<Asignatura> asignatura) {this.asignatura = asignatura;}
	
	// toString //
	
	@Override
	public String toString() {
		return super.toString() + " y mi nota media es: " + this.notaMedia; 
	}
	
	// METHODS //
	
	public void listarAsignaturas() {
		System.out.println(this.asignatura.toString());
	}
	
}
