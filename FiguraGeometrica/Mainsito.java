package FiguraGeometrica;

public class Mainsito {

	public static void main(String[] args) {
		
		Triangulo t = new Triangulo (2,2,3,4);
		Rectangulo r = new Rectangulo(1,1);
		System.out.println(r.comparaArea(t));
	}

}
