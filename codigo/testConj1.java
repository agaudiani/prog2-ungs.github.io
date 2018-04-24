import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/* 
 * Unos Tips para hacer buenos test
 * -Testear la especificación, olvidarnos un poco del código (es más, que el test lo haga alguien diferente al que programó)
 * -Al menos un test para cada función
 * -Dependiendo de la funcionalidad a testear siempre tratar de testear al menos 3 cosas.
 * -- Un caso que de bien
 * -- Un caso que falle
 * -- Un caso borde
 * 
 * Algunos de los assert más comunes
 * 
 * assertEquals(cosa1, cosa2) => ambas cosas iguales para que pase el test
 * assertTrue(cosa) => cosa tiene que ser true para que pase el test
 * assertFalse(cosa) => cosa tiene que ser false para que pase el test
 * 
 * 
 */	

public class test {

	conjunto1<String> conjStr1;
	conjunto1<String> conjStr2;
	
	// Lo que ponemos en este metodo se ejecuta antes de cada test
	// Inicializamos las variables
	@Before
	public void setUp() {
		conjStr1 = new conjunto1<String>();
		conjStr2 = new conjunto1<String>();
	}


	/* Hagamos un test para "agregar"
	 * Cual es la funcionalidad principal que queremos testear?
	 * Es un "agregar" de conjunto, deberia cumplir
	 * 1- Que cuando agregue un elemento nuevo lo agregue bien
	 * 2- Que cuando agregue un elemento repetido no lo agregue
	 *  
	 * */

	@Test
	public void testAgregar() {
		conjStr1.Agregar("A");
		
		conjStr2.Agregar("B");
		conjStr2.Agregar("B");	
		conjStr2.Agregar("B");
		conjStr2.Agregar("C");		
		conjStr2.Agregar("C");
		conjStr2.Agregar("C");		
		
		assertEquals(conjStr1.iesimo(0),"A");
		//solo para poner un ejemplo con assertTrue, podiamos hacer con assertEquals
		assertTrue(conjStr2.iesimo(0)=="B");
		//solo para poner un ejemplo con assertFalse, podiamos hacer con assertEquals
		assertFalse(conjStr2.iesimo(0)=="C");
		assertEquals(conjStr2.iesimo(1),"C");		
	}
/*
 * Tamaño
 * Que nos interesa, que nos diga siempre la cantidad de elementos del conjunto
 * 
 * Que cosas pueden fallar? y que como este implementado cuente de más o de menos
 * Tratemos de reflejar esos casos
 * 
 * 
 */
		
	@Test
	public void testTamanio() {
		//El conjunto vacio tiene tamaño 0
		assertEquals(conjStr1.tamanio(),0);
		//El conjunto con un elemento tiene tamaño 1				
		conjStr1.Agregar("A");
		assertEquals(conjStr1.tamanio(),1);		

		//Ahora veamos que cuando agregue un elemento repetido no me aumente la cantidad de elementos
		conjStr2.Agregar("G");
		conjStr2.Agregar("G");		
		assertEquals(conjStr2.tamanio(),1);
	}
	
	/*
	 * IMPLEMENTAR LOS TEST QUE FALTAN, DE NECESITAR FUNCIONES ADICIONALES EN EL TAD IMPLEMENTARLAS Y TESTEARLAS
	 * 
	 * */
	
}
