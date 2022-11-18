package generation.italy.shop;

import java.util.Random;

public class Product {

	private int code;
	private String name;
	private String brand;
	private int price;
	private int tax;
	public static char eur = '\u20ac';
	
	public Product() {
		Random rnd = new Random();
		this.code = rnd.nextInt(90000) + 10000;
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
		this.price = price;
	}
	
	public int getTaxedPrice() {
		return price + tax;
	}
	
// P. Taxes
	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	
	@Override
	public String toString() {
		return "Prodotto: -------------------------" + 
				"\nCodice: " + getCode() +
				"\nNome: " + getName() +
				"\nBrand: " + getBrand() +
				"\nPrezzo: " + getPrice() +
				"\nTasse: " + getTax() +
				"\nPrezzo con tasse: " + getTaxedPrice() +
				"\n----------------------------------"; 
	}
	
}
