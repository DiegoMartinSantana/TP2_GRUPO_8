package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayList<Profesor> profesores = new ArrayList<>();
		
		profesores.add(new Profesor(45, "Julian Alvares", 20, "Matemáticas"));
        profesores.add(new Profesor(50, "María López", 25, "Física"));
        profesores.add(new Profesor(35, "Carlos Gallardo", 10, "Química"));
        profesores.add(new Profesor(40, "Ana Sosa", 15, "Biología"));
        profesores.add(new Profesor(55, "Laura Velez", 30, "Historia"));
        
        Iterator<Profesor> iterador = profesores.iterator();
        
        while (iterador.hasNext()) {
            Profesor profesor = iterador.next();
            System.out.println(profesor.toString());
        }
	}


	}
