package proyecto;

public class PilaCebra {
	private int max=30;
	private Cebras v[]= new Cebras [max+1];
	private int tope;
	public PilaCebra() {
		tope=0;
	}

    boolean esvacia ()
    {
	if (tope == 0)
	    return (true);
	return (false);
    }


    boolean esllena ()
    {
	if (tope == max)
	    return (true);
	return (false);
    }


    int nroelem ()
    {
	return (tope);
    }


    void adicionar (Cebras elem)
    {
	if (!esllena ())
	{
	    tope++;
	    v [tope] = elem;
	}
	else
	    System.out.println ("Pila llena");
    }


    Cebras eliminar ()
    {
	Cebras elem = new Cebras ();
	if (!esvacia ())
	{
	    elem = v [tope];
	    tope--;
	}
	else
	    System.out.println ("Pila vacia");
	return (elem);
    }


    void mostrar ()
    {
	Cebras elem;
	if (esvacia ())
	    System.out.println ("Pila vacia");
	else
	{
	    System.out.println ("\n Datos de la Pila ");
	    PilaCebra aux = new PilaCebra();
	    while (!esvacia ())
	    {
		elem = eliminar ();
		elem.mostrar();
		aux.adicionar (elem);
	    }
	    while (!aux.esvacia ())
	    {
		elem = aux.eliminar ();

		adicionar (elem);
	    }
	}
    }


    void llenar (int n)
    {
	int i;

	for (i = 1 ; i <= n ; i++)
		{
	    Cebras l = new Cebras ();
	    l.leer();
	    adicionar (l);
		}
    }

}
