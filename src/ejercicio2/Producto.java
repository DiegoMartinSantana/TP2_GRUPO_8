package ejercicio2;

public class Producto {
	
	private String fechaCaducidad;
	private int numeroLote;

    public Producto(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
    
    public Producto() {
		this.fechaCaducidad = "1/1/1000";
		this.numeroLote= -1;
	}

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public void mostrarInformacion() {
        System.out.println("Fecha de Caducidad: " + fechaCaducidad);
        System.out.println("Número de Lote: " + numeroLote);
    }
}
