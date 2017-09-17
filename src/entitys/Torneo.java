package entitys;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
	private int cantLuchadores;
	private List<Luchador> luchadores;
	public Torneo()
	{
		luchadores=new ArrayList<Luchador>();
	}
	@Override
	public String toString() {
		return "Torneo [luchadores=" + luchadores + "]";
	}
	public int getCantLuchadores() {
		return cantLuchadores;
	}
	public void setCantLuchadores(int cantLuchadores) {
		this.cantLuchadores = cantLuchadores;
	}
	public List<Luchador> getLuchadores() {
		return luchadores;
	}
	public void setLuchadores(List<Luchador> luchadores) {
		this.luchadores = luchadores;
	}
	
	
}
