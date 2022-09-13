package es.freecodecamp.basicsoop;

public class StockKeeper {
	
	// ATTRIBUTES
	public String name;
	
	/*
	 * Constructor
	 */
	public StockKeeper(String name) {
		this.name=name;
	}
	
	//METHODS
	public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies) {
		
		/**
		 * Al invocar este método se crea un objeto album y se le pasan los atributos de objeto por parámetros
		 */
		album.name=name;
		album.artist=artist;
		album.price=price;
		album.numberOfCopies=numberOfCopies;
		
		/**
		 * Imprimimos los detalles del albúm a modo de prueba
		 */
		System.out.println("Album nanaged by; " + this.name);
		System.out.println("Album details::::::::::::::");
		System.out.println("Album name: " + album.name);
		System.out.println("Album artis: "+ album.artist);
		System.out.println("Album price: " + album.price +"$");
		System.out.println("Album number of copies: " +album.numberOfCopies);
		
	}

}
