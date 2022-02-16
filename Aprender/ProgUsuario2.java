package Aprender;

public class ProgUsuario2 {

	public void imprimeUsuario(Usuario2 usr) {
	//   usr.nombre equivale en este caso a usr.getNombre()
	      System.out.println("\nNombre: " + usr.nombre );
	      System.out.println("Edad: " + usr.getEdad() );
	      System.out.println("Direccion: " + usr.getDireccion() +"\n");		
	   }
	   
	
	public static void main(String[] args) {
		ProgUsuario2 prog = new ProgUsuario2( );
	      Usuario2 usr1,usr2;     /* Se declaran dos objetos de la clase Usuario2 */

	      /* Se utiliza el constructor por omisión */	
	      usr1 = new Usuario2( ); 
	      prog.imprimeUsuario(usr1);

	     /* Se utiliza el segundo constructor de Usuario2 */	  
	      usr2 = new Usuario2("Eduardo",24,"Mi direccion");  
	      prog.imprimeUsuario(usr2);

	     /* Se utiliza el tercer constructor de Usuario2 */			
	      usr1 = new Usuario2(usr2);    

	     /* En este caso usr1.setDireccion("nuevoValor"); equivale 
	        a usr1.direccion = "nuevoValor";   */
	      usr1.setDireccion("Otra direccion"); 

	      prog.imprimeUsuario(usr1);				
	      prog.imprimeUsuario(usr2);						
	   }
	}