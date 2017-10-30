package proyecto;

public class Cebras {
	private String nombre;
	private int nrotel;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getNrotel() {
		return nrotel;
	}
	public void setNrotel(int nrotel) {
		this.nrotel = nrotel;
	}

	public void leer(){
		System.out.println("Insertar Nombre");
		nombre=Leer.dato();
		System.out.println("Insertar Numero de Telefono:");
		nrotel=Leer.datoInt();
	}
	public void leer(String n, int t){
		nombre=n;
		nrotel=t;
	}

	public void mostrar(){
		System.out.println("Nombre " + nombre + "-"+" Numero Telefono " + nrotel);
	}
}
