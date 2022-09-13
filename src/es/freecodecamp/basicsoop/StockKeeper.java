package es.freecodecamp.basicsoop;

public class StockKeeper {

	// ATTRIBUTES
	public String name;

	/*
	 * Constructor
	 */
	public StockKeeper(String name) {
		this.name = name;
	}

	// METHODS
	public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies) {

		/**
		 * Al invocar este método se crea un objeto album y se le pasan los atributos de
		 * objeto por parámetros
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
		System.out.println("Album artis: " + album.getArtist());
		System.out.println("Album price: " + album.getPrice() + "$");
		System.out.println("Album number of copies: " + album.getNumberOfCopies());
		System.out.println("------------------------------------");
	}
	
	public void manageMovie(Movie movie, String name, String director, double price, int numberOfCopies) {

		/**
		 * Al invocar este método se crea un objeto movie y se le pasan los atributos de
		 * objeto por parámetros
		 */
		movie.setName(name);
		movie.setDirector(director);
		movie.setPrice(price);
		movie.setNumberOfCopies(numberOfCopies);

		/**
		 * Imprimimos los detalles de la movie a modo de prueba
		 */
		System.out.println("------------------------------------");
		System.out.println("Movie managed by: " + this.getName());
		System.out.println("Movie details::::::::::::::");
		System.out.println("Movie name: " + movie.getName());
		System.out.println("Movie artis: " + movie.getDirector());
		System.out.println("Movie price: " + movie.getPrice() + "$");
		System.out.println("Movie number of copies: " + movie.getNumberOfCopies());
		System.out.println("------------------------------------");
	}

	// GETTERS SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
