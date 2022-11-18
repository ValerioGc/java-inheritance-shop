package generation.italy.shop;

public class Headphones extends Product {

	private String color;
	private boolean wireless;

	
	public Headphones(String name, String brand, int price, int tax, String color, boolean wireless) {
		super(name, brand, price, tax);
		this.color = color;
		this.wireless = wireless;
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
		return  "\n: "  + super.toString()
				+ "\nColore: "  + getColor() 
				+ "\nCollegamento: " + isWireless()  
				+ "\n-----------------------------------";
	}
}
