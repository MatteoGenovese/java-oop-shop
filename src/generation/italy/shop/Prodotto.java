package generation.italy.shop;



import java.util.Random;

public class Prodotto {
	
	int code;
	String name;
	String description;
	float price;
	float tax=0.2f;
	
	public Prodotto(String name, String description, float price) {
		
		this.name = name;
		this.description = description;
		this.price=price;
		Random rnd= new Random();
		this.code = rnd.nextInt(90000)+10000; 
	}
	
	float getPriceWithoutTax() {
		return this.price;
	}
	
	float getPriceWithTax() {
		return this.price+(this.price/ (1 + this.tax)) * this.tax;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "code: " + code 
				+ "\ndescription: " + description
				+ "\nprice: " + getPriceWithoutTax()
				+ "\nprice with tax: " + getPriceWithTax();
	}
	
	


}
