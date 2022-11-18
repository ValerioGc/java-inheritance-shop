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
	}
}
