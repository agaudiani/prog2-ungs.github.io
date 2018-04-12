package Clase_20180410;

import java.util.ArrayList;

public class ListaCoordenadas {
 
	
	private ArrayList<Tupla<Integer,Integer> > coordenadas;	// variable privada porque no queremos que sea visible desde afuera
	
	public ListaCoordenadas(){	// Constructor
		coordenadas = new ArrayList<Tupla<Integer,Integer> >();
	}
	
	
	// Metodos
	public Tupla<Integer,Integer> dameCoordenada(int indice){	// Devuelve la coordenada a partir del indice pasado por parametro
		return coordenadas.get(indice);
	} 
	
	public void agregarCoordenadas( Tupla<Integer,Integer> coord ){	// Setea la coordenada 
		coordenadas.add(coord);
	}
	
	
	
	
	
	
	
}
