package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor>{

	/*CONSTRUCTORES*/
	public Profesor(){
		super(); //llama construct vacio de empleado
	}
	
	public Profesor(int edad, String nombre,int antiguedad,String cargo){
		//llamo construct de empleado
		super(nombre,edad);
		set_cargo(_cargo);
		set_antiguedadDocente(antiguedad);
		
	}
	
	/*PROPIEDADES*/
	private String _cargo;
	private int _antiguedadDocente;
	
	/*SET AND GET(APLICO ENCAPSULAMIENTO)*/
	public String get_cargo() {
		return _cargo;
	}

	public void set_cargo(String _cargo) {
		this._cargo = _cargo;
	}
	public int get_antiguedadDocente() {
		return _antiguedadDocente;
	}
	public void set_antiguedadDocente(int _antiguedadDocente) {
		this._antiguedadDocente = _antiguedadDocente;
	}
	@Override
	public String toString() {
		return " ID: "+ getId() + "  Nombre: "+ getNombre() 
				+ " Edad: " + getEdad() + " Cargo: " + getEdad() + " Antiguedad: "   + get_antiguedadDocente() ;
	}

	@Override
	public int compareTo(Profesor p) {
		//ordenamiento id de mayor a menor
		if(p.getId() == this.getId())return 0;
		if(p.getId()<this.getId()) return -1;
		return 1;
	}
	

	
}
