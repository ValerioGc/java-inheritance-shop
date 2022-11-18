package generation.italy.shop;

import java.util.Random;

public class Smartphone extends Product{
	
	private int memory;
	private String imeiCode;
	
	
	public Smartphone(String name, String brand, int price, int tax, int memory, String imeiCode) {
		super(name, brand, price, tax);
		this.memory = memory;
		this.imeiCode = imeiCode;
	}

	public String getImeiCode() {
		return imeiCode;
	}
	public void setImeiCode(String imeiCode) {
		this.imeiCode = imeiCode;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	@Override
	public String toString(){
		return 
				"\n" + super.toString() 
				+ "\nIMEI: "  +  getImeiCode()  
				+ "\nMemoria: "  + getMemory() + "GB" 
				+ "\n-----------------------------------";
	}
	
}
