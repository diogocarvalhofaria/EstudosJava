
public class main {
	
	public static void main(String [] args) {
		System.out.println("mang");
		System.out.println("cabeça de batata");
		System.out.println("cabeça de batata");
		System.out.println("cabeça de batata");
		System.out.println("cabeça de batata");
		
		// Erro ao converter objetos nulos em string
		try {
		Object miu = null; 
		String mang = miu.toString(); 
		}catch (Exception i) {
			 i.printStackTrace();
		}
	}
}
