package Vigenere;

public class Vig {

	static String Alphabet = "abcdefghijklmnopqrstuvwxyz";

	// fontion de criptage
	public static String Crypter(String text, String cle) {
		// recupere la cle ayant la meme longuer que le mot
		String textCrypter = "";
		int j = -1;
		// on parcour le mot de on cherche la version cripter de chaque letre
		// schant que la cle et le text son de meme taille
		for (int i = 0; i < text.length(); i++) {
			int value = Alphabet.indexOf(text.charAt(i)) != -1 ? Alphabet.indexOf(text.charAt(i)) : Alphabet.toUpperCase().indexOf(text.charAt(i));
			if (value == -1) {
				textCrypter += text.charAt(i);
			} else {
				j++;
				int key = Alphabet.indexOf(cle.charAt(j));
				// calcule de caractere cryter
				int x = (value + key) % 26;
				// ajoute a la chaine des crypter
				if (Character.isUpperCase(text.charAt(i)))
					textCrypter += Character.toUpperCase(Alphabet.charAt(x));
				else
					textCrypter += Alphabet.charAt(x);
				if (j == cle.length() - 1)
					j = -1;
			}
		}
		return textCrypter;
	}

	public static String DecripterText(String text, String cle) {
		// exactement le meme procesus
		String textDecripte = "";
		int j = -1;
		for (int i = 0; i < text.length(); i++) {
			int value = Alphabet.indexOf(text.charAt(i)) != -1 ? Alphabet
					.indexOf(text.charAt(i)) : Alphabet.toUpperCase().indexOf(
					text.charAt(i));
			if (value == -1) {
				textDecripte += text.charAt(i);
			} else {
				j++;
				int key = Alphabet.indexOf(cle.charAt(j));
				// calcule de caractere cryter
				int x = (value - key + 26) % 26;
				// ajoute a la chaine des crypter
				if (Character.isUpperCase(text.charAt(i)))
					textDecripte += Character.toUpperCase(Alphabet.charAt(x));
				else
					textDecripte += Alphabet.charAt(x);
				if (j == cle.length() - 1)
					j = -1;
			}
		}
		return textDecripte;
	}
}
