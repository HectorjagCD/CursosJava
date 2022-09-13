package es.freecodecamp.basicsoop;

// From: https://www.freecodecamp.org/news/java-object-oriented-programming-system-principles-oops-concepts-for-beginners/

public class Album {

	// ATTRIBUTES
	private String name;
	private String artist;
	private double price;
	private int numberOfCopies;

	// METHODS
	/**
	 * Método para vender albums
	 */
	public void sellCopies() {

		if (numberOfCopies > 0) {
			numberOfCopies--;
			System.out.println("One album has sold!");
		} else {
			System.out.println("No more albums available!");
		}
	}

	/**
	 * 
	 * @param num Número de albumes a ordenar/solicitar Método para comprar albumes
	 */
	public void orderCopies(int num) {
		numberOfCopies += num;
	}

	// GETTERS SETTERS
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (this.price > 0) {
			this.price = price;
		} else {
			System.out.println("You can't set a negative price, price set to 0.0");
			this.price = 0.0;
		}
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		if (this.numberOfCopies>0) {
			this.numberOfCopies = numberOfCopies;
		} else {
			System.out.println("You can't set negative copies quantity, quantity set to 0.0");
			this.numberOfCopies=0;
		}
		
	}

	
}
