

package exercicio;

import java.util.Locale;

public class execicio {
	public static void exercicio(String[] args) {
		String product1 = "Cuputer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		int gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double price3 = 53.2310;
		
		
		System.out.println ("Products:");
		System.out.printf ("Coumputer, wich price is $ ", price1);
		System.out.printf ("Office desk, wich price is $ ", price2);
		
		System.out.printf ("Record: %i years old, code %i and gender: ", gender);
		
		
		System.out.printf ("Record: %i years old, code %i and gender: ", price1);
		
		System.out.printf ("Measue with eight decimal places: ", price3);
		Locale.setDefault(Locale.US);
		System.out.printf ("Rouded: %.2f ", price3);
		
		System.out.printf ("Us decimal point: %.3f ", price3);
		
		


	}
}
