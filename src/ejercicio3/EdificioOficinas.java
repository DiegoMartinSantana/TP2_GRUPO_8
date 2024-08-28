package ejercicio3;

public class EdificioOficinas implements  IEdificio{

	private int oficinas;
	private double superficie;
	
	public EdificioOficinas(int oficinas,double superficie) {
		this.oficinas = oficinas;
		this.superficie = superficie;
	}
	
	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}
	public int getOficinas() {
		return oficinas;
	}

	@Override
	public String toString() {
		return "Edificio de Oficinas: Oficinas = " + oficinas + ", Superficie = " + superficie;
	}
}
