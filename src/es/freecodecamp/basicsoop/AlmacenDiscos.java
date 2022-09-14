package es.freecodecamp.basicsoop;

public class AlmacenDiscos {

	public static void main(String[] args) {

		StockKeeper johnDoe = new StockKeeper("John Doe");
		johnDoe.manageAlbum(new Album(), "Ok Computer", "Radiohead", 15.90, 4);

		/*
		 * Creamos un objeto con valores negativos para arreglar implementacion
		 * aplicando Encapsulación
		 */
		StockKeeper bob = new StockKeeper("Bob");
		bob.manageAlbum(new Album(), "Pulse", "Pink Floyd", -1000.0, -50);

		StockKeeper Jules = new StockKeeper("Jules");
		Jules.manageMovie(new Movie(), "Memento", "Cristopher Nolan", 21, 5);
		
		
		Shape circle = new Circle();
		
		// Ejemplo implementación clase abstracta Shape empleando Circle
		circle.draw();
		
		// Ejemplo implementación Interface 
		System.out.println(Runnable.a);
		
	}

}
