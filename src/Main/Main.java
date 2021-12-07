package Main;

import Views.MainView;
import Vigenere.Vigenere;


public class Main {
	public static void main(String[] args) {
		System.out.println("hello world");
		//MainView main = new MainView();
		
		String text = "cherchez";
		
		String cle="indice";
		
		String lc= Vigenere.Crypter(text, cle);
		String a = Vigenere.DecripterText(lc, cle);
		
		System.out.println(lc);

		System.out.println(a);
	}
}
