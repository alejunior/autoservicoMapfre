package serviços;

public class MascaraTel {

	public static void main(String[] args) throws Exception {

		String entrada = "(041) 9 3456-7894";
		
		String saida = "";
		String tel = "";
		String ddd = "";

		// limpando a string
		entrada = entrada.replaceAll("[().,/-]", "").replaceAll(" ", "");
		if (entrada.indexOf("0") == 0) {
			entrada = entrada.replaceFirst("0", "");
			if (entrada.indexOf("0") == 0) {
				entrada = entrada.replaceFirst("0", "");
			}
		}
		int qtChar = entrada.length();
		System.out.println(entrada + " sem formatação.");

		// regras
		if (qtChar < 8) {
			throw new Exception("telefone inválido.");
		}

		switch (qtChar) {
		case 8: {
			tel = entrada;
			ddd = "";
			saida = "(" + ddd + ")" + "****-**" + tel.substring(qtChar - 2, qtChar);
		}
			break;
		case 9: {
			tel = entrada;
			ddd = "";
			saida = "(" + ddd + ")" + "*****-**" + tel.substring(qtChar - 2, qtChar);
		}
			break;
		case 10: {
			tel = entrada.substring(qtChar - 8, qtChar);
			int qtCharTel = tel.length();
			ddd = entrada.substring(0, 2);
			saida = "(" + ddd + ")" + "****-**" + tel.substring(qtCharTel - 2, qtCharTel);
		}
			break;
		case 11: {
			tel = entrada.substring(qtChar - 8, qtChar);
			int qtCharTel = tel.length();
			ddd = entrada.substring(0, 2);
			saida = "(" + ddd + ")" + "*****-**" + tel.substring(qtCharTel - 2, qtCharTel);
		}
			break;
		case 12: {
			tel = entrada.substring(qtChar - 8, qtChar);
			int qtCharTel = tel.length();
			ddd = entrada.substring(0, qtChar - 8);
			saida = "(" + ddd + ")" + "****-**" + tel.substring(qtCharTel - 2, qtCharTel);
		}
			break;
		default: {
			tel = entrada.substring(qtChar - 9, qtChar);
			int qtCharTel = tel.length();
			ddd = entrada.substring(0, qtChar - 9);
			System.out.println(tel);
			System.out.println(ddd);
			saida = "(" + ddd + ")" + "*****-**" + tel.substring(qtCharTel - 2, qtCharTel);
		}
		}

		System.out.println("Telefone: " + saida);
	}
}
