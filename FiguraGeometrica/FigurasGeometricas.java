package FiguraGeometrica;

public abstract class FigurasGeometricas {

	public FigurasGeometricas() {
	
	}
	
	public abstract double calcularPerimetro();
	
	public abstract double calcularArea();
	
	public String comparaArea (FigurasGeometricas f) {
		String res="";
		
		if (this.calcularArea()>f.calcularArea()) {
			res="El primero es mayor";
		} else {
			res="El segundo es mayor";
		}
		return res;
	}

}
