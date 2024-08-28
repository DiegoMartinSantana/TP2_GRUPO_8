package ejercicio2;

public class ProductoFresco extends Producto{

	private String fechaEnvasado;	
	private String paisOrigen;
	
	public ProductoFresco(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
	
	public ProductoFresco() {
		super();
		this.fechaEnvasado="1/1/0001";
		this.paisOrigen="Sin país";
	}

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de Envasado: " + fechaEnvasado);
        System.out.println("País de Origen: " + paisOrigen);
    }
	
}
