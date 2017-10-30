package proyecto;


public class CSCalle {
	private int max=10;
	private Calle v[]=  new Calle[max+1];
	private int ini,fin;

	public CSCalle() {
		ini = 0;
		fin = 0;
	}



	boolean esvacia ()
	{
		if (ini == 0 && fin == 0)
			return (true);
		return (false);
	}


	boolean esllena ()
	{
		if (fin == max)
			return (true);
		return (false);
	}


	int nroelem ()
	{
		return (fin - ini);
	}


	void adicionar (Calle elem)
	{
		if (!esllena ())
		{
			fin++;
			v [fin] = elem;
		}
		else
			System.out.println ("Cola Simple llena");
	}


	Calle eliminar ()
	{
		Calle elem = new Calle();
		if (!esvacia ())
		{
			ini++;
			elem = v [ini];
			if (ini == fin)
				ini = fin = 0;
		}
		else
			System.out.println ("Cola Simple vacia");
		return (elem);
	}


	void mostrar ()
	{
		Calle elem;
		if (esvacia ())
			System.out.println ("Sin Registros de Calles");
		else
		{
			System.out.println ("\n Datos de las Calles");
			//System.out.println ("\n Numerador  Denominador ");
			CSCalle aux = new CSCalle ();
			while (!esvacia ())
			{
				Calle x= eliminar ();

				x.mostrar();
				aux.adicionar (x);

			}
			while (!aux.esvacia ())
			{
				elem = aux.eliminar ();

				adicionar (elem);
			}
		}
	}


	void llenar (int n, PilaCebra q)
	{
		int i;
		for (i = 1 ; i <= n ; i++)
		{
			Calle z = new Calle ();
			
			z.leer(q);
			adicionar (z);
		}
	}


	void vaciar (CSCalle a)
	{
		while (!a.esvacia ())
			adicionar (a.eliminar ());

	}
}
