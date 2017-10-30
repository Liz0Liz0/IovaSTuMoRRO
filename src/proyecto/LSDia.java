package proyecto;

public class LSDia {
	
private NodoDia p = new NodoDia();
	
	LSDia(){
		p=null;
	}

	public NodoDia getP() {
		return p;
	}

	public void setP(NodoDia p) {
		this.p = p;
	}
	
	public void adiprincipio(PilaCebra q){
		NodoDia nuevo= new NodoDia();
		nuevo.leer(q);		
		nuevo.setSig(getP());
		setP(nuevo);		
	}
	
	public void adifinal(NodoDia nuevo){
		if (getP()==null) 
			setP(nuevo);
		else{
			NodoDia r=getP();
			while(r.getSig()!=null)
				r=r.getSig();
			r.setSig(nuevo);
		}
	}
	
	public void leer1(int n, PilaCebra q){
		for (int i = 1; i <=n; i++) {
			NodoDia nuevo = new NodoDia();
			nuevo.leer(q);
			adifinal(nuevo);
		}
	}
	
	public void mostrar(){
		NodoDia w = getP();
		System.out.print(" Mostrando Dias ");
		while (w!=null) {	
			w.mostrar();
			System.out.print(" ---");
			w=w.getSig();
		}
	}
	public int nroNodos(){
		int c=0;
		NodoDia r=getP();
		while(r!=null){
			c++;
			r=r.getSig();
		}
		return c;
	}
}
