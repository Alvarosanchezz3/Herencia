package iLista;

public class mainsito {

	    public static void main(String[] args) {

	        Pila pilon=new Pila(5);
	        pilon.Push(4);
	        System.out.println(pilon);
	        pilon.Push(6);
	        pilon.Push(7);
	        pilon.Push(7);
	        pilon.Push(7);
	        pilon.Push(9);
	        System.out.println(pilon);
	        pilon.Pop();
	        System.out.println(pilon);

	    }

	}
