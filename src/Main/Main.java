package Main;

import Views.MainView;
import Vigenere.Vig;

public class Main {
	public static void main(String[] args) {
		System.out.println("hello world");
		 MainView main = new MainView();

		String text = "Cherchez au pied de l'arbre";

		String cle = "indice";

		String lc = Vig.Crypter(text, cle);
		String a = Vig.DecripterText(lc, cle);

		System.out.println(lc);

		System.out.println(a);
	}
}
