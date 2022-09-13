package es.freecodecamp.basicsoop;

public class AlmacenDiscos {

	public static void main(String[] args) {
		
		StockKeeper johnDoe = new StockKeeper("John Doe");
		johnDoe.manageAlbum(new Album(),"Ok Computer","Radiohead",15.90, 4);
		
		/*
		 * Creamos un objeto con valores negativos para arreglar implementacion aplicando Encapsulación
		 */
		StockKeeper bob = new StockKeeper("Bob");
		bob.manageAlbum(new Album(),"Pulse","Pink Floyd",-1000.0,-50);
		
		
		
		
	}

}
