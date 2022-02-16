package Ajedrez;

import java.util.ArrayList;

public class Tablero {
	private ArrayList<ArrayList<Casilla>> tablerito;
	
	public Tablero() {
		tablerito= new ArrayList<ArrayList<Casilla>>();
		String letras="ABCDEFGH";
		for(int i=0;i<8;i++) {
			this.tablerito.add(new ArrayList<Casilla>());
			for(int j=0;j<8;j++) {
				if(i==1) {
					this.tablerito.get(i).add(new Casilla(letras.charAt(j),8-i,new Peon(true)));
					this.tablerito.get(i).get(j).getPiecita().setCasillita(this.tablerito.get(i).get(j));
				}else if(i==6) {
					
					this.tablerito.get(i).add(new Casilla(letras.charAt(j),8-i,new Peon(false)));
					this.tablerito.get(i).get(j).getPiecita().setCasillita(this.tablerito.get(i).get(j));
				}else if(i==0 && (j==0 || j==7)) {
					
					this.tablerito.get(i).add(new Casilla(letras.charAt(j),8-i,new Torre(true)));
					this.tablerito.get(i).get(j).getPiecita().setCasillita(this.tablerito.get(i).get(j));
				}else if(i==7 && (j==0 || j==7)) {
					
					this.tablerito.get(i).add(new Casilla(letras.charAt(j),8-i,new Torre(false)));
					this.tablerito.get(i).get(j).getPiecita().setCasillita(this.tablerito.get(i).get(j));
				}else if(i==0 && (j==1|| j==6)) {
					
					this.tablerito.get(i).add(new Casilla(letras.charAt(j),8-i,new Caballo(true)));
					this.tablerito.get(i).get(j).getPiecita().setCasillita(this.tablerito.get(i).get(j));
				}else if(i==7 && (j==1|| j==6)) {
					
					this.tablerito.get(i).add(new Casilla(letras.charAt(j),8-i,new Caballo(false)));
					this.tablerito.get(i).get(j).getPiecita().setCasillita(this.tablerito.get(i).get(j));
				}else if(i==0 && (j==2|| j==5)) {
					
					this.tablerito.get(i).add(new Casilla(letras.charAt(j),8-i,new Alfil(true)));
					this.tablerito.get(i).get(j).getPiecita().setCasillita(this.tablerito.get(i).get(j));
				}else if(i==7 && (j==2|| j==5)) {
					
					this.tablerito.get(i).add(new Casilla(letras.charAt(j),8-i,new Alfil(false)));
					this.tablerito.get(i).get(j).getPiecita().setCasillita(this.tablerito.get(i).get(j));
				}else if(i==0 && (j==3)) {
					
					this.tablerito.get(i).add(new Casilla(letras.charAt(j),8-i,new Reina(true)));
					this.tablerito.get(i).get(j).getPiecita().setCasillita(this.tablerito.get(i).get(j));
				}else if(i==7 && (j==3)) {
					
					this.tablerito.get(i).add(new Casilla(letras.charAt(j),8-i,new Reina(false)));
					this.tablerito.get(i).get(j).getPiecita().setCasillita(this.tablerito.get(i).get(j));
				}else if(i==0 && (j==4)) {
					
					this.tablerito.get(i).add(new Casilla(letras.charAt(j),8-i,new Rey(true)));
					this.tablerito.get(i).get(j).getPiecita().setCasillita(this.tablerito.get(i).get(j));
				}else if(i==7 && (j==4)) {
					
					this.tablerito.get(i).add(new Casilla(letras.charAt(j),8-i,new Rey(false)));
					this.tablerito.get(i).get(j).getPiecita().setCasillita(this.tablerito.get(i).get(j));
				}
				else {
					this.tablerito.get(i).add(new Casilla());	
				}
				
			}
		}
	}

	public ArrayList<ArrayList<Casilla>> getTablerito() {
		return tablerito;
	}

	public void setTablerito(ArrayList<ArrayList<Casilla>> tablerito) {
		this.tablerito = tablerito;
	}
	
	@Override
	public String toString() {
		String res="";
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				res+=this.tablerito.get(i).get(j);
			}
			res+="\n";
		}
		return res;
	}
}
