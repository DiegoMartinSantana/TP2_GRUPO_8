package ejercicio3;

public class Polideportivo implements IInstalacionDeportiva, IEdificio{
	private String nombre;
	private double superficie;
	private int tipoInstalacion;
	
	public Polideportivo(String nombre, double superficie, int tipoInstalacion) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public int getTipoDeInstalacion() {
        return tipoInstalacion;
    }

    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }

    @Override
	public String toString() {
		return "Polideportivo: Nombre = " + nombre + ", Superficie = " + superficie + ", Tipo de Instalacion = " + tipoInstalacion;
	}

	public String getNombre() {
        return nombre;
    }
}
