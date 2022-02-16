package Ajedrez;

public class mainsito {
	public static void main(String[] args) {
		Tablero tablerito= new Tablero();
		System.out.println(tablerito);
		tablerito.getTablerito().get(7).get(0).getPiecita().moverse(tablerito, 'A', 2);
		System.out.println(tablerito);
	}
}
