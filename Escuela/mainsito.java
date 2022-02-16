package Escuela;

import java.util.ArrayList;

public class mainsito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante alvaro = new Estudiante("Alvaro","43567865Z",7);
		Asignatura asig= new Asignatura("Entornos de desarrollo");
		Asignatura asig2= new Asignatura("LM");
		
		ArrayList<Asignatura> asignaturas= new ArrayList<Asignatura>();
		asignaturas.add(asig);
		asignaturas.add(asig2);
		
		Profesor galisteo = new Profesor("Galisteo", "65378293T",32342,asignaturas);
		asig.setProfe(galisteo);
		asig2.setProfe(galisteo);		
		alvaro.listarAsignaturas();
		asig.matricular(alvaro);
		asig2.matricular(alvaro);
		alvaro.listarAsignaturas();
		asig.listarAlumnos();
		asig.baja(alvaro);
		alvaro.listarAsignaturas();
	}

}
