package generation.italy.shop;

public class Television extends Product{

	private int screenSize;
	private boolean smart;
	
	public Television(int screenSize, boolean smart) {
		this.screenSize = screenSize;
		this.smart = smart;
	}
	
	public Television(String name, String brand, int price, int tax) {
		super(name, brand, price, tax);
	}
	
	
	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public String isSmart() {
		String tvType;
		if (smart) {
			tvType = "Si";
		} else {
			tvType = "No";
		}
		return tvType;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	@Override
	public String toString(){
		return "Prodotto: TV" +
				"\nNome: "  + getName() + 
				"\nMarca: "  + getBrand() + 
				"\nDimensione: "  + getScreenSize() + " pollici" + 
				"\nSmart: "  + isSmart() + 
				"\nPrezzo: "  + getPrice() + EUR + 
				"\nTasse: " + getTax() + PERC + 
				"\nPrezzo con tasse: " + getTaxedPrice() + " " + EUR + 
				"\n-----------------------------------" ;
	}

}
