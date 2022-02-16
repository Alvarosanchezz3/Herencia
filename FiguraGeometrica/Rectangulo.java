package FiguraGeometrica;

public class Rectangulo extends FigurasGeometricas {
		
	private int base;
	private int altura;
		
	public Rectangulo(int base,int altura) {
		super();
		this.base=base;
		this.altura=altura;
	}
	
	@Override
	public double calcularPerimetro () {
		double res= 2*this.base + 2*this.altura;
		return res;
	}
	
	@Override
	public double calcularArea () {
		double res= this.base * this.altura;
		return res;
	}
	
}
