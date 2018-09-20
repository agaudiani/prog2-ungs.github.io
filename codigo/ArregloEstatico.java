import java.util.ArrayList;

public class ArregloEstatico<T> {
	

	ArrayList<T> datos;
	
	public ArregloEstatico(int tamano){
		datos = new ArrayList<T>( );
		for (int i=0; i< tamano; i++){
			datos.add(null);
		}
}
	public T leer(int indice){
		if (indice < datos.size())
			return datos.get(indice);
		else
			throw new RuntimeException("indice incorrecto");
	}
	
	public void escribir(T valor, int indice){
		if (indice < datos.size())
			datos.set(indice, valor);
		else
			throw new RuntimeException("indice incorrecto");
	}
}

-----------------------------------------------------------------------------
public class UsoArrEstatico {

	public static void main(String[] args) {
		
		ArregloEstatico<String> a1 = new ArregloEstatico<String>(5);
		ArregloEstatico<Fecha> a2 = new ArregloEstatico<Fecha>(3);
		a1.escribir("hola0", 2);
		a1.escribir("hola1", 3);
		a2.escribir(new Fecha(1, 2, 1980),2);
		System.out.println(a1.leer(3));
		System.out.println(a2.leer(2));
	}

}
