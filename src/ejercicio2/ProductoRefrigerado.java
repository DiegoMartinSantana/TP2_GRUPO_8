package ejercicio2;

public class ProductoRefrigerado extends Producto{

	private String codigoOrganismo;
	
	public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String codigoOrganismo) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Código del Organismo de Supervisión: " + codigoOrganismo);
    }
}
