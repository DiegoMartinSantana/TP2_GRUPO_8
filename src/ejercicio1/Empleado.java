package ejercicio1;

public class Empleado {

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

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
