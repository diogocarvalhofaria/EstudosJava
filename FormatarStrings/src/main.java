public class main {
	
	public static void main (String[] args) {
		
		String original = "asa asas ASAS ASS ass MNFDMMA    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("asa", "xy");
		int i = original.indexOf("as");
		int j = original.lastIndexOf("as");
		
		String s = "pao arroz batata";
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		
		
		System.out.println("original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace: -" + s06 + "-");
		System.out.println("replace(\"asa\", \"xy\"): -" + s07 + "-");
		System.out.println("replace(\"asa\", \"xy\"): -" + s07 + "-");
		System.out.println("IndexOf: -" + i + "-");
		System.out.println("lastindexof: -" + j + "-");
		
		
		
		
	}
	
}