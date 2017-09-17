package entitys;

public class Luchador {
	private long id;
	private double altura;
	private double peso;
	private int domina;
	@Override
	public String toString() {
		return "Luchador [domina=" + domina + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public int getDomina() {
		return domina;
	}
	public void setDomina(int domina) {
		this.domina = domina;
	}
	
}
