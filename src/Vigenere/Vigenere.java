package Vigenere;

public class Vigenere {

	static String Alphabet = "abcdefghijklmnopqrstuvwxyz";

	// fontion de criptage
	public static String Crypter(String text, String cle) {

		// recupere la cle ayant la meme longuer que le mot
		cle = getLaLongueCle(text, cle);

		String textCrypter = "";

		// on parcour le mot de on cherche la version cripter de chaque letre
		// schant que la cle et le text son de meme taille
		for (int i = 0; i < text.length(); i++) {

			int key = Alphabet.indexOf(cle.charAt(i));
			int value = Alphabet.indexOf(text.charAt(i));

			// calcule de caractere cryter
			int x = (value + key) % 26;

			// ajoute a la chaine des crypter
			textCrypter += Alphabet.charAt(x);
		}
		return textCrypter;
	}

	public static String DecripterText(String text, String cle) {

		// exactement le meme procesus

		cle = getLaLongueCle(text, cle);
		String textDecripte = "";

		for (int i = 0; i < text.length(); i++) {

			int key = Alphabet.indexOf(cle.charAt(i));
			int value = Alphabet.indexOf(text.charAt(i));

			int x = (value - key + 26) % 26;

			textDecripte += Alphabet.charAt(x);
		}
		return textDecripte;
	}

	// cette methode va nous pemetre de generer la longue cle qui
	// sera juste un repetition de la cle normal juska la taille du text
	public static String getLaLongueCle(String text, String cle) {
		String longueCle = "";
		for (int i = 0; i < text.length(); i++) {
			longueCle += cle.charAt(i % cle.length());
		}
		return longueCle;
	}

}
