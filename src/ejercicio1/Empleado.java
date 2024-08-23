package ejercicio1;

public class Empleado {

    private final int id;
	
	private static int cont = 1000;
	
	private String nombre;
	
	private int edad;

	public Empleado() {
		
		id = cont;
		nombre = "sin nombre";
		edad = 99;
		cont ++ ;
		
	}
	public Empleado(String nom,int ed) {
	
		id = cont;
		nombre = nom;
		edad = ed;
		cont ++ ;
		
	}
	
	public int getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		nombre = nom;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int ed) {
		edad = ed;
	}

	public String toString() {
		return "Empleado: "+ nombre + ", edad:"+ edad +", Legajo:" + id ;
	}
	
	public static int devuelveProximoID() {
		return cont;
	}
}
