package generation.italy.shop;

import java.util.Random;

public class Smartphone extends Product{
	
	private int imeiCode;
	private int memory;
	
	
	public Smartphone(int memory) {
		Random rnd = new Random();
		this.imeiCode = rnd.nextInt(9000) + 1000;
	}
	
	public Smartphone(String name, String brand, int price, int tax, int memory) {
		super(name, brand, price, tax);
		this.memory = memory;
	}

	public int getImeiCode() {
		return imeiCode;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	@Override
	public String toString(){
		return "Prodotto: Smartphone" +
				"\nNome: "  + getName() + 
				"\nMarca: "  + getBrand() +
				"\nIMEI: "  +  getImeiCode() + 
				"\nMemoria: "  + getMemory() + "GB" +
				"\nPrezzo: "  + getPrice() + EUR + 
				"\nTasse: " + getTax() + " " + PERC + 
				"\nPrezzo con tasse: " + getTaxedPrice() + " " + EUR + 
				"\n-----------------------------------" ;
	}
	
}
