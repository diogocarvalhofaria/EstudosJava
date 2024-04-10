import java.util.Locale;

public class Main {

	
	
	public static void main(String[] args) {
		int y = 32;
		double x = 10.2313;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		System.out.println("Ola uno");
		System.out.println("Ola uno");
		System.out.println("Ola uno");
		System.out.println("Ola uno");
		System.out.print("mang");
		System.out.print("mang");
		Locale.setDefault(Locale.US);
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.println(x + y);
		System.out.printf("%.4f%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
