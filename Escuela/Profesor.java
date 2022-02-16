package Escuela;

import java.util.ArrayList;

public class Profesor extends Persona{
	
	private double sueldo;
	private ArrayList<Asignatura> asignaturas;
	
	// CONSTRUCTOR //
	
	public Profesor() {
		super();
		this.sueldo=0;
		this.asignaturas= new ArrayList<Asignatura>();
	}
	
	public Profesor(String nombre, String dni, double sueldo,ArrayList<Asignatura> asignaturas) {
		super(nombre,dni);
		this.sueldo=sueldo;
		this.asignaturas= asignaturas;
	}
	
	// GETTERS AND SETTERS //
	
	public double getSueldo() {return sueldo;}
	public void setSueldo(double sueldo) {this.sueldo = sueldo;}
	
	public ArrayList<Asignatura> getAsignaturas() {return asignaturas;}
	public void setAsignaturas(ArrayList<Asignatura> asignaturas) {this.asignaturas = asignaturas;}
	
	// toString //
	
	@Override
	public String toString() {
		return "Profesor [sueldo=" + sueldo + ", nombre=" + nombre + ", dni=" + dni + "]";
	}
	
}
