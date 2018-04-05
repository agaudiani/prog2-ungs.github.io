public class Nat {
	
	//Variables de instancia
	private int num;
	
	// Constructor
	Nat(Integer n)
	{
		if(n>0) //Valido el IREP
			this.num = n;
		else
			throw new RuntimeException("El número ingresado debe ser mayor a 0");
	}
	
	//Métodos
	void sumar(Nat n) //No hace falta validar n>0 porque ya es un Nat
  {
    this.num = this.num + n.num;
	}
	
	void restar(Nat n)
  {
			int calculo = this.num + n.num;
			if (calculo >0)
				this.num = calculo;
			else
				throw new RuntimeException("El resultado de la resta no es un número Natural");
		}

	@Override
	public String toString() {
		return "Nat: " + this.num;
	}

	public int getNaT() {
		return num;
	}

	public void setNat(int n) {
		if(n>0)
			this.num = n;
		else
			throw new RuntimeException("El número ingresado debe ser mayor a 0");
	}

}
