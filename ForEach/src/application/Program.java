package application;

public class Program {

	public static void main(String[] args) {
		String[] vect = new String[] {" mang", "uan", "pepino"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("--------------------");
		for (String mang : vect ) {
			System.out.println(mang);
		}

	}

}
