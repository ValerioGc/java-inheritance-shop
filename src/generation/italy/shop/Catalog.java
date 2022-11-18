package generation.italy.shop;

import java.util.Scanner;

public class Catalog {

	String[] products;
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Creazione prodotto:\n----------------------");
		System.out.println("Quale Prodotto vuoi inserire? (smartphone, tv, cuffie)");
		String inputUser = scn.nextLine();
		if (inputUser.equals("smartphone")) {
			Smartphone sm1 = new Smartphone(64);
			System.out.println("Inserisci il nome del Prodotto");
			inputUser = scn.nextLine();
			sm1.setName(inputUser);
			System.out.println("Inserisci la marca del Prodotto");
			inputUser = scn.nextLine();
			sm1.setBrand(inputUser);
			System.out.println("Inserisci il prezzo del Prodotto");
			int intUser = scn.nextInt();
			sm1.setPrice(intUser);
			System.out.println("Inserisci ila tassazione del Prodotto");
			intUser = scn.nextInt();
			sm1.setTax(intUser);
			System.out.println(sm1);
		} 
		else if (inputUser.equals("tv")) {
			Television sm1 = new Television(55, true);
			System.out.println("Inserisci il nome del Prodotto");
			inputUser = scn.nextLine();
			sm1.setName(inputUser);
			System.out.println("Inserisci la marca del Prodotto");
			inputUser = scn.nextLine();
			sm1.setBrand(inputUser);
			System.out.println("Inserisci il prezzo del Prodotto");
			int intUser = scn.nextInt();
			sm1.setPrice(intUser);
			System.out.println("Inserisci ila tassazione del Prodotto");
			intUser = scn.nextInt();
			sm1.setTax(intUser);
			System.out.println(sm1);
		} else if (inputUser.equals("cuffie")) {
			Headphones hp1 = new Headphones("Nere", true);
			System.out.println("Inserisci il nome del Prodotto");
			inputUser = scn.nextLine();
			hp1.setName(inputUser);
			System.out.println("Inserisci la marca del Prodotto");
			inputUser = scn.nextLine();
			hp1.setBrand(inputUser);
			System.out.println("Inserisci il prezzo del Prodotto");
			int intUser = scn.nextInt();
			hp1.setPrice(intUser);
			System.out.println("Inserisci ila tassazione del Prodotto");
			intUser = scn.nextInt();
			hp1.setTax(intUser);
			System.out.println(hp1);
		}
		scn.close();
		
		System.out.println();
	}
	
	@Override
	public String toString() {
		String stre = null;
		for (int i = 0; i < products.length; i++ ) {
			stre += products[i];
		}
		return stre;
	}

}
