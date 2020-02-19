package serviços;

public class MascaraEmail {

	public static void main(String[] args) throws Exception {

		String email = "jales@gmail.com";

		String code = "";
		int arroba = (email.indexOf("@"));

		if (arroba == -1) {
			throw new Exception("e-mail inválido");
		} else {
			for (int i = 0; i < arroba - 2; i++) {
				code = code + "*";
			}

			String emailNovo = email.substring(0, 1) + code + email.substring(arroba - 1);
			System.out.println(email);
			System.out.println(emailNovo);
		}
	}
}
