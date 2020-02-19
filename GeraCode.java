package serviços;

public class GeraCode {

	public static void main(String[] args) {

		for (int h = 0; h < 15; h++) {
			
		
		
		char[] carct = { 'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H',
				'i', 'I', 'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q',
				'r', 'R', 's', 'S', 't', 'T', 'u', 'U', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z'};
		
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

		char[] charEspec = {'@', '#', '$', '%', '&'};
		
		int qtCarct = 4;
		int qtNum = 3;
		int qtCharEspec = 1;

		String senha = "";
		for (int i = 0; i < qtCarct; i++) {
			int j = (int) (Math.random() * carct.length);
			senha += carct[j];
		}
		
		String numero = "";
		for (int i = 0; i < qtNum; i++) {
			int j = (int) (Math.random() * num.length);
			numero += num[j];
		}
		
		String carctEspecial = "";
		for (int i = 0; i < qtCharEspec; i++) {
			int j = (int) (Math.random() * charEspec.length);
			carctEspecial += charEspec[j];
		}
		
		int q = (int) (Math.random() * senha.length());
		String password_a = senha.substring(0, q);
		String password_b = senha.substring(q, senha.length());
		
		System.out.println("access_pin: " + password_a + numero + carctEspecial + password_b);
	}
	}
}
