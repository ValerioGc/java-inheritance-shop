package generation.italy.shop;

public class Television extends Product{

	private int screenSize;
	private boolean smart;
	
	public Television() {
		super();
	}
	
	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	@Override
	public String toString(){
		return "Prodotto: TV ---------------------" +
				"\nNome: "  + getName() + 
				"\nMarca: "  + getBrand() + 
				"\nPollici: "  + getScreenSize() + 
				"\nSmart: "  + isSmart() + 
				"\nPrezzo: "  + getPrice() + EUR + 
				"\nTasse: " + getTax() + " " + PERC + 
				"\nPrezzo con tasse: " + getTaxedPrice() + " " + EUR + 
				"\n-----------------------------------" ;
	}

}
