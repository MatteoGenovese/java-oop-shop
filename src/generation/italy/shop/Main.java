package generation.italy.shop;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("name: ");
		String name = sc.nextLine();
		
		System.out.print("description: ");
		String description = sc.nextLine();
		
		System.out.print("price: ");
		float price = sc.nextFloat();
		
		Prodotto p = new Prodotto(name, description, price);
		
		System.out.println("-----------------");
		
		System.out.println(p);

		

	}

}
