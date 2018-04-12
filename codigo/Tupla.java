package Clase_20180410;

public class Tupla<T1,T2> {
	
	private T1 primero;
	private T2 segundo;
	
	public Tupla(T1 primero,T2 segundo){	// Constructor
		this.primero = primero;		// se agrega el this para mayor claridad
		this.segundo = segundo;		// dado que el parametro y el miembro interno tienen el mismo nombre
	}
	

	public T1 getX(){
		return this.primero;
	}
	
	public T2 getY(){
		return this.segundo;
	}
	
	public void setX(T1 primero){
		this.primero = primero;
	}
	
	public void setY(T2 segundo){
		this.segundo = segundo;
	}
	
	
}
