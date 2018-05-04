package tad_MIB;

import java.util.ArrayList;

//Conceptos: Irep - for extendido - Tad != estructura datos - Lista Vs conjunto -
// Acum booleano -

//Irep: Solo almacenamos las coordenadas positivas(true)
public class MIB {
private ArrayList<Tupla<Integer, Integer>> coordenadasPositivas ;
//Ejercicio1: cambiar la estructura interna de un ArrayList a un Conjunto
//Ejercicio2: Calcular la complejidad de setearValor y leerValor
private int cantFilas;
private int cantColumnas;

public MIB(int filas, int columnas){
	cantFilas = filas;
	cantColumnas = columnas;
	coordenadasPositivas  = new ArrayList<Tupla<Integer, Integer>>();
}

public void chequearIrep(int fila, int columna){
	if (fila > cantFilas || columna > cantColumnas) throw new RuntimeException("Fuera de rango");
	
}

public void setearValor(int fila, int columna, boolean valor){
	chequearIrep(fila, columna);
	
	boolean ret = false;
	Tupla<Integer,Integer> nuevaT = new Tupla<Integer,Integer>(fila, columna);
	
	if (valor){
	// si no existe, lo agrego a la lista
		for (Tupla<Integer,Integer> unaT : coordenadasPositivas){
			ret = ret || (unaT.x.equals(fila) && unaT.y.equals(columna)); // si no sabemos implementar equals
			// si sabemos, es mas apropiado decir:
			// ret = ret || unaT.equals(nuevaT);
		}
		
		if (!ret) coordenadasPositivas.add(nuevaT);
	}else{
	// si existe, la elimino de la lista, para simular el false
		
		// Si tuvieramos Tupla.equals, utilizar coordenadasPositivas.contains(), de lo contrario
		for (int j=coordenadasPositivas.size()-1; j>=0; j--){
			if 	(coordenadasPositivas.get(j).x.equals(fila) && coordenadasPositivas.get(j).y.equals(columna)){
				coordenadasPositivas.remove(j);
			}
				
		}
	}
	
}

public boolean leerValor(int fila, int columna){
	chequearIrep(fila, columna);
	Tupla<Integer,Integer> nuevaT = new Tupla<Integer,Integer>(fila, columna);
	
	// vamos a hacer de cuenta que tenemos Tupla.equals() para no repetir el "for"	
	// contains utiliza el equals() de tupla del del for para ver si pertenece
	return (coordenadasPositivas.contains(nuevaT));
	
}

@Override
public String toString(){
	String ret = "";
	
	for (Tupla<Integer,Integer> unaT : coordenadasPositivas){
		ret = ret + unaT + ", ";
	}

	return ret;
}

}
