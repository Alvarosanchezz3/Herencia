package iLista;

import java.util.ArrayList;

public class Cola extends Lista implements iLista{

	private int capmax;
	private ArrayList <Integer> cola;
	
	public Cola() {
		super();
	}
	
	public Cola(int capmax) {
		super(capmax);
		this.cola = new ArrayList<Integer>();
	}

	// Getters and setters //
	
	public int getCapmax() {return capmax;}
	public void setCapmax(int capmax) {this.capmax = capmax;}

	public ArrayList<Integer> getCola() {return cola;}
	public void setCola(ArrayList<Integer> cola) {this.cola = cola;}
	
	// Métodos //
	
	@Override
	public String toString () {
		return this.cola.toString();
	}
	
	@Override
	public boolean isEmpty() {
		return this.cola.isEmpty();
	}
	
	@Override
	public boolean Push (int pushito) { // Mete a alguien en la cola //
		boolean res=false;
		if (this.cola.size()<this.capmax) {
			this.cola.add(pushito);
		}
		return res;
	}
	
	@Override
	public int Pop () { // Saca a algn de la cola // 
		int aux = 0;
		if (!this.isEmpty()) {
			aux=this.cola.get(0);
			this.cola.remove(0);
		}
		return aux;
	}
}

