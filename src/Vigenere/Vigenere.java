package Vigenere;

public class Vigenere {

	// fontion de criptage
	public static String Crypter(String text, String cle) {
      
		// recupere la cle ayant la meme longuer que le mot
		cle = getLaLongueCle(text, cle);

		String textCrypter = "";
	   
	    // on parcour le mot de on cherche la version cripter de chaque letre schant que la cle et le text son de meme taille
		for (int i = 0; i < text.length(); i++) {
			char key = cle.charAt(i);
			char value = text.charAt(i);
            // calcule de caractere cryter
			int x = (value - 'a' + key - 'a') % 26;
			x += 'a';
			// ajoute a la chaine des crypter
			textCrypter += (char) (x);
		}
		return textCrypter;
	}

	public static String DecripterText(String text, String cle) {

		// exactement le meme procesus
		
		cle = getLaLongueCle(text, cle);
		String textDecripte = "";

		for (int i = 0; i < text.length(); i++) {

			char key = cle.charAt(i);
			char value = text.charAt(i);

			int x = (value - key + 26) % 26;
		    x += 'a';
			textDecripte += (char) (x);
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
