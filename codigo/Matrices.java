package acumBoolMat;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejemplo que retorna false
		int[][] matEjem1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(ejercicio1(matEjem1));
		// Ejemplo que retorna true
		int[][] matEjem2 = {{1,-2,3,4},{6,5,7,-8},{9,10,-12,11}};
		System.out.println(ejercicio1(matEjem2));
	}

	static boolean esNegativo(int n){
		return n<0;
	}
	
	static boolean esImpar(int n){
		return n%2==1;
	}
	
	static boolean ejercicio1(int[][] mat){
		boolean hayNeg, hayImpar;
		boolean todosNeg = true, todosImpar = true;
		for (int f=0; f<mat.length; f++) {
			hayNeg = false;
			for(int c=0; c<mat[0].length; c++){
				hayNeg = hayNeg || esNegativo(mat[f][c]);
			}
			todosNeg = todosNeg && hayNeg;
		}
		for (int c=0; c<mat[0].length; c++) {
			hayImpar = false;
			for(int f=0; f<mat.length; f++){
				hayImpar = hayImpar || esImpar(mat[f][c]);
			}
			todosImpar = todosImpar && hayImpar;
		}
		return todosNeg && todosImpar;
	}
}
