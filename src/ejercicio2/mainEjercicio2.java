package ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		//Productos frescos
		
				ProductoFresco PF = new ProductoFresco();
				
				PF.setFechaCaducidad("25/1/2024");
				PF.setFechaEnvasado("5/12/2023");
				PF.setNumeroLote(50);
				PF.setPaisOrigen("Argentina");

				System.out.println(PF.toString());

	}

}
