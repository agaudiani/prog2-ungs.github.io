public class mayorDiv {

	public static boolean mayorDiversidad(int[][] matriz){
		return filasAcendentes(matriz) && columnasParImpar(matriz);
	}
	
	public static boolean columnasParImpar(int[][] matriz){
		boolean ret = true;
		for(int i=0;i<matriz[0].length;i++){
			ret = ret && columnasPI(matriz,i);
		}
		return ret;
	}
	
	public static boolean columnasPI(int[][] matriz, int columna){
		boolean ret1 = false;
		boolean ret2 = false;
		for(int i=0;i<matriz.length;i++){
			ret1 = ret1 || matriz[i][columna]%2==0;
			ret2 = ret2 || matriz[i][columna]%2!=0;
		}
		return ret1 && ret2;
	}	
	
	public static boolean filasAcendentes(int [][] matriz){
		boolean ret = true;
		for(int i=0;i<matriz.length;i++){
			ret = ret && crece(matriz[i]);
		}
		return ret;
	}
	
	public static boolean crece(int [] fila){
		boolean ret = true;
		for(int i=0;i<fila.length-1;i++){
			ret = ret && fila[i]<fila[i+1];
		}
		return ret;
	}
}
