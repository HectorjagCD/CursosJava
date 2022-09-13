package es.freecodecamp.basicsoop;

// From: https://www.freecodecamp.org/news/java-object-oriented-programming-system-principles-oops-concepts-for-beginners/

public class Album {

	// ATTRIBUTES
	public String name;
	public String artist;
	public double price;
	public int numberOfCopies;

	// METHODS
	/**
	 * Método para vender albums
	 */
	public void sellCopies () {
		
		if (numberOfCopies>0) {
			numberOfCopies--;
			System.out.println("One album has sold!");
		} else {
			System.out.println("No more albums available!");
		}
	}
	/**
	 * 
	 * @param num Número de albumes a ordenar/solicitar
	 * Método para comprar albumes
	 */
	public void orderCopies(int num) {
		numberOfCopies+=num;
	}

}
