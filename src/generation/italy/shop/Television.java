package generation.italy.shop;

public class Television extends Product{

	private int screenSize;
	private boolean smart;
	

	public Television(String name, String brand, int price, int tax, int screenSize, boolean smart) {
		super(name, brand, price, tax);
		this.screenSize = screenSize;
		this.smart = smart;
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
		return "\n: "  + super.toString()
				+ "\nDimensione: "  + getScreenSize() + " pollici"  
				+ "\nSmart: "  + isSmart()  
				+ "\n-----------------------------------";
	}

}
