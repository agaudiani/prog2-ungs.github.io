package ArbolBB;

public class ArbolBB {
	NodoBB raiz;
	public ArbolBB()
	{
		raiz = null;
	}
	private boolean vacio()
	{
		if (raiz==null)
			return true;
		else
			return false;
	}
	public NodoBB raiz()
	{
		return raiz;
	}
	public void insertar(int dato)	{

		raiz= insertar(raiz,dato);

	}

	private NodoBB insertar(NodoBB actual,int dato )
	{
		if (actual!=null)
		{
		int res=actual.compare(dato);
		if (res>0)
			actual.setHIzq(insertar(actual.hijoIzq(),dato));
	    if (res<0)
	    	actual.setHDer(this.insertar(actual.hijoDer(),dato));
		}
		else
		{
			actual = new NodoBB(dato);
		}
		return actual;

	}


	}




