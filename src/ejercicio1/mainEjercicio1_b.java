package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
        TreeSet <Profesor> profesores = new TreeSet<>();
		
		profesores.add(new Profesor(45, "Julian Alvares", 20, "Matem�ticas"));
        profesores.add(new Profesor(50, "Mar�a L�pez", 25, "F�sica"));
        profesores.add(new Profesor(35, "Carlos Gallardo", 10, "Qu�mica"));
        profesores.add(new Profesor(40, "Ana Sosa", 15, "Biolog�a"));
        profesores.add(new Profesor(55, "Laura Velez", 30, "Historia"));
        
        Iterator<Profesor> iterador = profesores.iterator();
        
        while (iterador.hasNext()) {
            Profesor profesor = iterador.next();
            System.out.println(profesor.toString());
        }
	}
}
