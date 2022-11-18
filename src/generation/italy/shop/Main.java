package generation.italy.shop;

import java.util.Scanner;

public class Main {
	
	static Product[] prodotti = null;
	static int countProdotti = 0;
	static Scanner scn = null;
	
	public static void main(String[] args) {
		
		Product pr1 = new Product("Prodotto 1", "Brand 1" , 26, 22);
		Product pr2 = new Product("Prodotto 2", "Brand 2", 100, 22);
		Smartphone smp1 = new Smartphone("FindX", "Oppo", 22, 20, 65, "dfsdfsdf");
		Television tv1 = new Television("Nu8700", "Samsung",  22, 30, 55, true);
		Headphones hdp1 = new Headphones("Void Elite", "Corsair",  22, 30, "Bianche", true);
		
		scn = new Scanner(System.in);
		prodotti = new Product[10];
		
		printProduct();
		
		boolean exit = false;
		while(!exit) {
			System.out.println("1- Visualizza il catalogo");
			System.out.println("2 - Inserisci nuovo prodotto");
			
			String userChoice = scn.nextLine();
			
			if (userChoice.equals("1")) {
				printProduct();
			} 
			if (userChoice.equals("2")) {
				createProduct();
			} 
		}
	}
	static void printProduct() {
		System.out.println("Lista prodotti: " + countProdotti);
		System.out.println("-------------------");
		for (int i=0;i<countProdotti;i++) {
			Product prd = prodotti[i];
			System.out.println(prd);
			System.out.println("-------------------");
		}
	}
	static void createProduct() {

		
	
		System.out.println("Prodotti disponibili: \n 1- Smartphone \n2 - Televisore \n3 - Cuffie");
		String userChoice = scn.nextLine();
		if (userChoice.equals("1")) {
			System.out.println("Inserisci il nome del Prodotto");
			String nameUser = scn.nextLine();
			System.out.println("Inserisci la marca del Prodotto");
			String brandUser = scn.nextLine();
			System.out.println("Inserisci il prezzo del Prodotto");
			int priceUser = scn.nextInt();
			System.out.println("Inserisci ila tassazione del Prodotto");
			int taxUser = scn.nextInt();
			Smartphone sm1 = new Smartphone(nameUser, brandUser,  priceUser, taxUser, 64, "dfsdfsdf");

			prodotti[countProdotti++] = sm1;
		}
		if (userChoice.equals("2")) {
			System.out.println("Inserisci il nome del Prodotto");
			String nameUser = scn.nextLine();
			System.out.println("Inserisci la marca del Prodotto");
			String brandUser = scn.nextLine();
			System.out.println("Inserisci il prezzo del Prodotto");
			int priceUser = scn.nextInt();
			System.out.println("Inserisci la tassazione del Prodotto");
			int taxUser = scn.nextInt();
			Television tv = new Television(nameUser, brandUser,  priceUser, taxUser, 55, true);
			prodotti[countProdotti++] = tv;
		}
		if (userChoice.equals("3")) {
			System.out.println("Inserisci il nome del Prodotto");
			String nameUser = scn.nextLine();
			System.out.println("Inserisci la marca del Prodotto");
			String brandUser = scn.nextLine();
			System.out.println("Inserisci il prezzo del Prodotto");
			int priceUser = scn.nextInt();
			System.out.println("Inserisci ila tassazione del Prodotto");
			int taxUser = scn.nextInt();
			Headphones hp1 = new Headphones(nameUser, brandUser,  priceUser, taxUser, "Bianche", true);
			prodotti[countProdotti++] = hp1;
		}
	}
}

