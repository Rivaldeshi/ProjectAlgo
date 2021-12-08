package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import Component.Button;
import Component.Label;
import Component.Panel;
import Component.Text;
import Vigenere.Vig;

@SuppressWarnings("serial")
public class Decryter extends Panel {

	public Decryter() {
		super();
		final Text text = new Text(0, 0);
		     
		final Label ltext = new Label("Entrer  Texte      ");

		final Text cle = new Text(0, 0);
		Label lcle = new Label("Entrer la cle          ");
		
		Panel ptext = new Panel(ltext, text);
		Panel pcle = new Panel(lcle, cle);

		Button verif = new Button("Crypter", 0);

		final Label res = new Label("");

		res.setForeground(Color.white);
		
		text.setText("Kuhzelmm dc rmmq gm n'ezoum");
		cle.setText("indice");
		
		this.add(ptext);
		this.add(pcle);
		this.add(res);

		JPanel p1 = new JPanel();
		p1.setBackground(Color.black);
		p1.add(verif);
		this.add(p1);

		verif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String te = text.getText();
				String cl = cle.getText();
				res.setForeground(Color.GREEN);
				res.setText("le text en claire est :  " + Vig.DecripterText(te, cl));
			}
		});

	}
}
