package Escuela;

import java.util.ArrayList;

public class Asignatura {
	
	private String nombre;
	private ArrayList<Estudiante> estudiantes;
	private Profesor profe;	
	
	// CONSTRUCTOR //
	
	public Asignatura() {
		this.nombre="";
		this.profe= new Profesor();
		this.estudiantes= new ArrayList<Estudiante>();
	}
	
	public Asignatura(String nombre) {
		this.nombre=nombre;
		this.profe=new Profesor();
		this.estudiantes= new ArrayList<Estudiante>();
	}
	
	// GETTERS Y SETTERS //
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public ArrayList<Estudiante> getEstudiantes() {return estudiantes;}
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {this.estudiantes = estudiantes;}
	
	public Profesor getProfe() {return profe;}
	public void setProfe(Profesor profe) {this.profe = profe;}
	
	// toString //
	
	@Override
	public String toString() {
		return this.nombre;
	}
	
	// METHODS //
	
	public void listarAlumnos() {
		System.out.println(this.estudiantes.toString());
	}
	
	public boolean matricular(Estudiante e1) {
		boolean res=false;
		if(!this.estudiantes.contains(e1)) {
			this.estudiantes.add(e1);
			e1.getAsignatura().add(this);
			res=true;
		}
		return res;
	}
	
	public boolean baja(Estudiante e1) {
		boolean res=false;
		if(this.estudiantes.contains(e1)) {
			this.estudiantes.remove(e1);
			e1.getAsignatura().remove(this);
			res=true;
		}
		return res;
	}
	
	
}
