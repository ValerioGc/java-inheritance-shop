package generation.italy.shop;

import java.util.Random;

public class Product {

	private int code;
	private String name;
	private String brand;
	private int price;
	private int tax;
	
	public static final char EUR = '\u20ac';
	public static final char PERC = '%';
	
	public Product() {
		Random rnd = new Random();
		this.code = rnd.nextInt(90000) + 10000;
	}
	public Product(String name, String brand, int price, int tax) {
		Random rnd = new Random();
		this.code = rnd.nextInt(90000) + 10000;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.tax = tax;
	}
// Code
	public int getCode() {
		return code;
	}

// P. Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

// P. Brand
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

// P. Price
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if (price < 0) {
			System.err.println("Il prezzo deve essere superiore a zero");
		} else {
			this.price = price;
		}
 	}
	public int getTaxedPrice() {
		return price + (this.price * tax) / 100;
	}
	
// P. Taxes
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		if ((tax > 1) && (tax <= 100)) {
			this.tax = tax;
		} else {
			System.err.println("Le tasse devono essere comprese tra 0 e 100%");
		}

	}
	
	@Override
	public String toString() {
		return "Prodotto: -------------------------" 
				+ "\nCodice: " + getCode() 
				+ "\nNome: " + getName() 
				+ "\nBrand: " + getBrand() 
				+ "\nPrezzo: " + getPrice() + " " + EUR
				+ "\nTasse: " + getTax() + " " + PERC 
				+ "\nPrezzo con tasse: " + getTaxedPrice() + " " + EUR; 
	}
	
}
