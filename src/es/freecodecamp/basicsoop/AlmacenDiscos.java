package es.freecodecamp.basicsoop;

public class AlmacenDiscos {

	public static void main(String[] args) {
		
		StockKeeper johnDoe = new StockKeeper("John Doe");
		
		johnDoe.manageAlbum(new Album(),"Ok Computer","Radiohead",15.90, 4);
		
	}

}
