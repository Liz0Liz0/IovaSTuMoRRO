package proyecto;

public class NodoDia {
	private int Dia;
	private String Mes;
	private CSCalle t = new CSCalle();
	private NodoDia sig;
	
	public int getDia() {
		return Dia;
	}

	public void setDia(int dia) {
		Dia = dia;
	}

	public String getMes() {
		return Mes;
	}

	public void setMes(String mes) {
		Mes = mes;
	}

	public CSCalle getT() {
		return t;
	}

	public void setT(CSCalle t) {
		this.t = t;
	}

	public NodoDia getSig() {
		return sig;
	}

	public void setSig(NodoDia sig) {
		this.sig = sig;
	}

	NodoDia(){
		sig=null;
	}
	
	public void leer(PilaCebra q)
	{
		System.out.println("Inserte el Dia");
		Dia = Leer.datoInt();
		System.out.println("Inserte el Mes");
		Mes = Leer.dato();
		System.out.println("Inserte El numero de Calles del Dia ");
		int nro = Leer.datoInt();
		t.llenar(nro, q);
	}
	
	public void mostrar()
	{
		System.out.println(" Dia " + Dia + " Mes " + Mes);
		t.mostrar();
	}
}
