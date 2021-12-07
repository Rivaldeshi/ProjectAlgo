package Views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Vigenere.Vigenere;
import Component.Button;
import Component.Frame;
import Component.Label;
import Component.Panel;
import Component.Text;

public class MainView {

	public Frame frame;

	public MainView() {

		frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final Text text = new Text(0, 0);
		final Label ltext = new Label("Entrer le Texte  ");

		final Text cle = new Text(0, 0);
		Label lcle = new Label("Entrer la cle          ");

		Panel ptext = new Panel(ltext, text);
		Panel pcle = new Panel(lcle, cle);

		Panel p = new Panel();

		Button verif = new Button("Crypter", 0);

		final Label res = new Label("");

		res.setForeground(Color.white);
		p.add(ptext);
		p.add(pcle);
		p.add(res);

		JPanel p1 = new JPanel();
		p1.setBackground(Color.black);
		p1.add(verif);
		p.add(p1);

		verif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String te = text.getText();
				String cl = cle.getText();

				res.setForeground(Color.GREEN);
				res.setText("le text Crypte est :  " + Vigenere.Crypter(te, cl));

			}
		});

		frame.add(p);
		frame.pack();
		frame.setVisible(true);

	}
}
