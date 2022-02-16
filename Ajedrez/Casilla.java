package Ajedrez;

public class Casilla {
	private char letra;
	private int num;
	private boolean ocupada;
	private Figura piecita;
	
	public Casilla() {
		letra=0;
		num=0;
		ocupada=false;
		piecita=null;
	}
	public Casilla(char letra,int num, Figura piecita) {
		this.letra=letra;
		this.num=num;
		this.ocupada=true;
		this.piecita=piecita;
	}
	public Casilla(char letra,int num) {
		this.letra=letra;
		this.num=num;
		this.ocupada=false;
		this.piecita=null;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	public Figura getPiecita() {
		return piecita;
	}
	public void setPiecita(Figura piecita) {
		this.piecita = piecita;
	}
	
	@Override
	public String toString() {
		String res="";
		if(this.piecita==null) {
			res="[ ]";
		}else {
			res= "[" + this.piecita + "]";
		}
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
}
