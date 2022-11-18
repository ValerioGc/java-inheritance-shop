package generation.italy.shop;

public class Headphones extends Product {

	private String color;
	private boolean wireless;
	
	
	public Headphones(String color, boolean wireless) {
		this.color = color;
		this.wireless = wireless;
	}
	
	public Headphones(String name, String brand, int price, int tax) {
		super(name, brand, price, tax);
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public String isWireless() {
		String linkType;
		if (wireless) {
			linkType = "Wireless";
		} else {
			linkType = "Cablato";
		}
		return linkType;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	@Override
	public String toString(){
		return "Prodotto: Cuffie" +
				"\nNome: "  + getName() + 
				"\nMarca: "  + getBrand() + 
				"\nColore: "  + getColor() +
				"\nPrezzo: "  + getPrice() + EUR +
				"\nCollegamento: " + isWireless() + 
				"\nTasse: " + getTax() + " " + PERC + 
				"\nPrezzo con tasse: " + getTaxedPrice() + " " + EUR + 
				"\n-----------------------------------" ;
	}
}
