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
		album.setName(name);
		album.setArtist(artist);
		album.setPrice(price);
		album.setNumberOfCopies(numberOfCopies);
		
		/**
		 * Imprimimos los detalles del albúm a modo de prueba
		 */
		System.out.println("------------------------------------");
		System.out.println("Album managed by: " + this.name);
		System.out.println("Album details::::::::::::::");
		System.out.println("Album name: " + album.getName());
		System.out.println("Album artis: "+ album.getArtist());
		System.out.println("Album price: " + album.getPrice() +"$");
		System.out.println("Album number of copies: " +album.getNumberOfCopies());
		System.out.println("------------------------------------");
	}

}
