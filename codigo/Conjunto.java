package Clase_20180410;

import java.util.ArrayList;

/*
 * Recordar:
 * 
 * 1-Encapsulamiento: Siempre que sea posible, se deben utilizar las funciones de la clase en lugar de preguntar por sus
 * variables internas o privadas(this).
 * Por ejemplo utilizar tamaño(), en lugar de this.vector.size() siempre que sea posible.
 * 
 * Reutilizacion: Siempre que sea posible, se deben reutilizar
 * los métodos de la propia clase para implementar nuevos métodos.
 * (implementar union/interseccion intentando utilizar iesimo/agregar.)
 */

public class Conjunto<T>{

	private ArrayList<T> conj;
	
	Conjunto(){
		/*
		 * Constructor
		 */
		conj = new ArrayList<T>();
	}
	
	public Conjunto(Conjunto<T> conj2){
		/*
		 * Constructor por copia
		 */
		conj = new ArrayList<T>();

		for (int i = 0 ; i < conj2.tamano() ; i++){   // esto o llamar al constructor por copia
			agregar(conj2.iesimo(i));
		}
	}
	
	int tamano(){	
		/*
		 * Devuelve el tamano del conjunto
		 */

		return conj.size();
	}
	
	public T iesimo(int iesimo){ 
		/*
		 *  Devuelve el iesimo elemento
		 *  (no esta muy bien que esto este en un conjunto)
		 *  Mas tarde en el curso vamos a ver como implementarlo bien usando iteradores
		 */


		//A completar
	}
	
	
	void agregar(T elem){	
		/* Agrega el elemento pasado por parametro 
		* y no hace nada si ese elemento ya 
		* se encontraba en el conjunto
		*/ 
		// a completar
	}
	
	public boolean pertenece(T elem ){ // devuelve True si elem esta en el conj
		// A completar
		
	}  

	
	
	
public Conjunto<T> union2(Conjunto<T> c){
	/*
	 * Realiza la union y la devuelve en un nuevo conjunto
	 * No se modifica this
	 */
	Conjunto<T> res = new Conjunto<T>(this);

	for(int i = 0 ; i < c.tamano() ; i++){
			res.agregar(c.iesimo(i));
	}
	
	return res;
	
}

void union(Conjunto<T> c){
	/*
	 * Realiza la union y this se modifica
	 */
	for(int i = 0 ; i < c.tamano() ; i++){
		agregar(c.iesimo(i));	// se puede hacer this.agregar (Es lo mismo)
	}
}


void interseccion(Conjunto<T> c){
	/*
	 * Realiza la interseccion y this se modifica
	 */

}

public Conjunto<T> interseccion2(Conjunto<T> c){
	/*
	 * Realiza la interseccion y la devuelve en un nuevo conjunto
	 * No se modifica this
	 */

}


}
