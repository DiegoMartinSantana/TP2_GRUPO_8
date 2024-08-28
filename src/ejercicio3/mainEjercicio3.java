package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;


public class mainEjercicio3 {

	public static void main(String[] args) {
		

		 ArrayList<IEdificio> edificios = new ArrayList<>();
			
		 edificios.add(new Polideportivo ("San lorenzo",1.6,2));
		 edificios.add(new Polideportivo ("Gimnasia de la plata",1.9,2));
		 edificios.add(new Polideportivo ("Rosario Central",0.7,2));
		 edificios.add(new EdificioOficinas(1,3.0));
		 edificios.add(new EdificioOficinas(1,4.0));
	        
	        Iterator<IEdificio> iterador = edificios.iterator();
	        
	        while (iterador.hasNext()) {
	            IEdificio edificio = iterador.next();
	            System.out.println(edificio.toString());
	        }
		
		
		
	}
}
