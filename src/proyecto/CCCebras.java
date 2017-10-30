package proyecto;
import java.util.Scanner;
public class CCCebras {
	private int max=50;
	private Cebras v[]= new Cebras[max+1];
	private int ini ,fin;
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Cebras[] getV() {
		return v;
	}
	public void setV(Cebras[] v) {
		this.v = v;
	}
	public int getIni() {
		return ini;
	}
	public void setIni(int ini) {
		this.ini = ini;
	}
	public int getFin() {
		return fin;
	}
	public void setFin(int fin) {
		this.fin = fin;
	}
	
	public CCCebras()  {
		
	}

	    int nroelem ()
	    {
	        return ((max + fin - ini) % max);
	    }


	    boolean esvacia ()
	    {
	        if (nroelem () == 0)
	            return (true);
	        return (false);
	    }


	    boolean esllena ()
	    {
	        if (nroelem () == max - 1)
	            return (true);
	        return (false);
	    }


	    void adicionar (Cebras elem)
	    {
	        if (!esllena ())
	        {

	            fin = (fin + 1) % max;
	            v [fin] = elem;
	        }
	        else
	            System.out.println ("Cola circular llena");
	    }


	    Cebras eliminar ()
	    {
	        Cebras elem = new Cebras ();
	        if (!esvacia ())
	        {
	            ini = (ini + 1) % max;
	            elem = v [ini];
	            if (nroelem () == 0)
	                ini = fin = 0;
	        }
	        else
	            System.out.println ("Cola circular vacia");
	        return (elem);
	    }


	    void mostrar ()
	    {
	        Cebras elem;
	        if (esvacia ())
	            System.out.println ("No Hay Cebras registradas");
	        else
	        {
	            System.out.println ("\n Datos de las Cebras ");
	            CCCebras aux = new CCCebras ();
	            while (!esvacia ())
	            {
	                elem = eliminar ();
	                aux.adicionar (elem);
	                elem.mostrar();
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
	    	Scanner Read = new Scanner(System.in);
	        for (int i = 1 ; i <= n ; i++)
	        {
	        	System.out.println("Esta Cebra participa en Fiestas Infantiles? Si/No");
	        	String Participa = Leer.dato();
	        	if(Participa.equals("Si")){
	        		Cebras elem = new Cebras ();
		            elem.leer ();
		            adicionar (elem);
		            q.adicionar(elem);
	        	}else{
	        		Cebras elem = new Cebras ();
		            elem.leer();
		            adicionar (elem);
	        	}
	            
	        }
	    }



	    void invertir ()
	    {
	        CCCebras a = new CCCebras();
	        CCCebras b = new CCCebras();
	        while (!esvacia ())
	        {
	            while (nroelem () != 1)
	                a.adicionar (eliminar ());
	            b.adicionar (eliminar ());
	            while (!a.esvacia ())
	                adicionar (a.eliminar ());
	        }
	        while (!b.esvacia ())
	            adicionar (b.eliminar ());

	    }


	    void vaciar (CCCebras a)
	    {
	        while (!a.esvacia ())
	            adicionar (a.eliminar ());

	    }
}
