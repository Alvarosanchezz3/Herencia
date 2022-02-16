package iLista;

import java.util.ArrayList;

public class Pila extends Lista implements iLista {
    private ArrayList<Integer> pila;

    //CONSTRUCTOR
    public Pila() {
        super();
    }

    public Pila(int capmax) {
        super(capmax);
        this.pila=new ArrayList<Integer>();
    }


    //GETTERS
    public ArrayList<Integer> getPila() {
            return pila;
        }

    //SETTERS
    public void setPila(ArrayList<Integer> pila) {
            this.pila = pila;
        }

    @Override
    public String toString() {
        String pila="";
        for (int i=this.pila.size()-1;i>=0;i--) {
               pila += "|" + this.pila.get(i) + "|";
        }
        return pila;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean Push(int pushito) {
        boolean res=false;
        if (this.pila.size()<this.capmax) {
        this.pila.add(pushito);
        res=true;
        }
        return res;
    }

    @Override
    public int Pop() {
        int aux=0;
        if(!this.isEmpty()) {
            aux=this.pila.get(this.pila.size()-1);
            this.pila.remove(this.pila.size()-1);
        }
        return aux;
    }

}
