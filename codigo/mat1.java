# Implementar una función booleana que dada una matriz
# devuelve verdadero sii
# a) en todas las columnas hay al menos un 8
# y
# b) en todas las filas hay al menos un 3

# PRECONDICIÓN
# La matriz es regular y no está vacia

boolean ejercio(int [][] mat){
boolean ret = true

for (int f = 0; f < mat.length; f++)
	ret = ret && almenosUn3Fila(mat, f)
for (int c = 0; c < mat[0].length; c++)
	ret = ret && almenosUn8Colu(mat, c)
return ret
}

boolean almenosUn3Fila(int[][] mat, int fila){
boolean ret = false
for (int c = 0; c < mat[0].length; c++)
	ret = ret || mat [fila][c] == 3
return ret
}

boolean almenosUn8Colu(int[][] mat, int colu){
boolean ret = false
for (int f = 0; f < mat.length; f++)
	ret = ret || mat [f][colu] == 8
return ret
}

