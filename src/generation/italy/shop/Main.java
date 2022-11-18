package generation.italy.shop;

public class Main {
	public static void main(String[] args) {
		Product pr1 = new Product();
		pr1.setName("Prodotto 1");
		pr1.setBrand("Brand 1");
		pr1.setPrice(25);
		pr1.setTax(20);
		System.out.println(pr1);
		
		Product pr2 = new Product("Prodotto 2", "Brand 2", 100, 22);
		System.out.println("\n" + pr2);
		
		
		Smartphone smp1 = new Smartphone(30);
		smp1.setName("Iphone 12");
		smp1.setBrand("Apple");
		smp1.setPrice(740);
		smp1.setMemory(64);
		smp1.setTax(22);
		
		System.err.println(smp1);
		
		
		Headphones hdp1 = new Headphones("Bianche", true);
		hdp1.setName("Void Elite");
		hdp1.setBrand("Corsair");
		hdp1.setPrice(140);
		hdp1.setTax(18);
		
		System.err.println(hdp1);
	}
}
