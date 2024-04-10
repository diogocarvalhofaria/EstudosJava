import java.util.Scanner;

public class repetitivafor {
	
	public static void repetitivafor(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		for (int i = 0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		sc.close();
	}
}