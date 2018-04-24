package conjunto;

import java.util.ArrayList;

public class conjunto1<T> {
	private ArrayList<T> elementos;
	
	conjunto1(){
			elementos = new ArrayList<T>();
		
	} // Constructor1
	int tamanio(){
		return elementos.size();		
	}
	void Agregar(T elem) {
		if (!elementos.contains(elem))
			elementos.add(elem);	
	}
	T iesimo(Integer indice){// indice< tamaño()
		return elementos.get(indice);
		
	} 
	void union(conjunto1<T> c){ // union1: Destructiva
		for(int i=0; i<c.tamanio();i++){
			this.Agregar(c.iesimo(i));
			//QUE PASA SI EN VEZ DE USAR EL AGREGAR LO PONIA DIRECTAMENTE EN EL ARRAYLIST ELEMS??
		}
	} 

	conjunto1<T> union2(conjunto1<T> c){	// union2: No debe tener Aliasing!
		conjunto1<T> res = new conjunto1<T>(); 

		for(int i=0; i<this.tamanio();i++){
			res.Agregar(this.iesimo(i));
		}
		for(int i=0; i<c.tamanio();i++){
			res.Agregar(c.iesimo(i));
		}

		return res;
		
	}

	void interseccion(conjunto1<T> c){ // interseccion 1: Destructiva
		//Tengo que trabajar con el arraylist, porque el conjunto no tiene operaciones para eliminar
		ArrayList<T> elemsNew = new ArrayList<T>();
		
		for(int i=0; i<c.tamanio();i++){
			
			if(elementos.contains(c.iesimo(i))){
				elemsNew.add(c.iesimo(i));
			}
			this.elementos = elemsNew;	
		}		
		
	} 
	conjunto1<T> interseccion2(conjunto1<T> c){ // interseccion 2: No destrcutiva
		conjunto1<T> res = new conjunto1<T>(); 

		for(int i=0; i<c.tamanio();i++){
			if(elementos.contains(c.iesimo(i))){
				res.Agregar(c.iesimo(i));
			}
			
		}
		
		return res;
		
	}
}

