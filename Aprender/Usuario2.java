package Aprender;

public class Usuario2 {

	String nombre;
    int edad;
    String direccion;                     

    public Usuario2( ) {    /* Equivale al contructor por omisión */
       nombre = null;
       edad = 0;
       direccion = null;		  		  
    }

    public Usuario2(String nombre, int edad, String direccion) {
    
       this.nombre = nombre;
       this.edad = edad;
       this.direccion = direccion;		 
    }

    public Usuario2(Usuario2 usr) {
    
       nombre = usr.getNombre();
       edad = usr.getEdad();
       direccion = usr.getDireccion();		 
    }
	  
    public void setNombre(String n){nombre = n;}
    public String getNombre(){return nombre;}

    public void setEdad(int e){edad = e;}
    public int getEdad(){return edad;}

    public void setDireccion(String d){direccion = d;}
    public String getDireccion() {return direccion;}
	
  
}
