package View;

import java.awt.Color;
import Component.Label;
import Component.Panel;
import Utils.Constans;

@SuppressWarnings("serial")
public class Propos extends Panel {
	public static int i = 0;


	Propos() {
		super("A propos");

		Label l=new Label("<html>             Bien venue Sur <br>  <u><center> " + Constans.title+" </center></u> </html> ", 27);
		l.setForeground(Color.BLUE);
		
		this.add(l);
		
		Label lab = new Label(
				"<html> <center>"
				+ "<br> contacter nous par Nous@gmail.com"
				+ " </center> </html>");
		lab.setForeground(Color.WHITE);
		this.add(lab);
	}

}
