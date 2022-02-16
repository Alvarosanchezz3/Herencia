package FiguraGeometrica;

public class Circulo extends FigurasGeometricas{

	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {return radio;}
	public void setRadio(double radio) {this.radio = radio;}
	
	@Override
	public double calcularPerimetro () {
		double res = (double) ((this.radio*this.radio) * (Math.PI));
		return res;
	}
	
	@Override
	public double calcularArea () {
		double res = (double) (2* Math.PI * this.radio);
		return res;
	}
}
