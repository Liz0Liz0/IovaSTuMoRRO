package proyecto;

public class Calle {
	private String Zona;
	private String Nombre;
	private int NroCebrasMañana;
	private CCCebras asdfM = new CCCebras();
	private int NroCebrasTarde;
	private CCCebras asdfT = new CCCebras();
	
	
	public String getZona() {
		return Zona;
	}
	
	public void setZona(String zona) {
		Zona = zona;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getNroCebrasMañana() {
		return NroCebrasMañana;
	}

	public void setNroCebrasMañana(int nroCebrasMañana) {
		NroCebrasMañana = nroCebrasMañana;
	}

	public CCCebras getAsdfM() {
		return asdfM;
	}

	public void setAsdfM(CCCebras asdfM) {
		this.asdfM = asdfM;
	}

	public int getNroCebrasTarde() {
		return NroCebrasTarde;
	}

	public void setNroCebrasTarde(int nroCebrasTarde) {
		NroCebrasTarde = nroCebrasTarde;
	}

	public CCCebras getAsdfT() {
		return asdfT;
	}

	public void setAsdfT(CCCebras asdfT) {
		this.asdfT = asdfT;
	}
	
	public void leer(PilaCebra q)
	{
		System.out.println("Insertar Zona");
		Zona=Leer.dato();
		System.out.println("Insertar Nombre de Calle:");
		Nombre=Leer.dato();
		
		System.out.println("Insertar nro Cebras mañaneras");
		NroCebrasMañana = Leer.datoInt();
		System.out.println("Insertar Cebras mañaneras");
		asdfM.llenar(NroCebrasMañana, q);
		
		System.out.println("Insertar nro Cebras tardias <>:{D");
		NroCebrasTarde = Leer.datoInt();
		System.out.println("Insertar Cebras Tardias");
		asdfT.llenar(NroCebrasTarde, q);
		
	}
	
	public void mostrar ()
	{
		System.out.println(" Zona | " + Zona + " | Calle | " + Nombre + " |");
		System.out.println(" En la Mañana tenemos " + NroCebrasMañana );
		asdfM.mostrar();
		System.out.println(" En la Tarde tenemos " + NroCebrasTarde );
		asdfT.mostrar();
	}
}
