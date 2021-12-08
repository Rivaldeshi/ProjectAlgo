package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;

import Component.Frame;
import Component.Panel;
import Component.TitreButton;

@SuppressWarnings("serial")
public class Menu extends Panel {

	public static TitreButton crypter = new TitreButton("Crypter Mot");
	public static TitreButton Decripte = new TitreButton("Decrypte Mot");
	public static TitreButton Etape = new TitreButton("Etape");
	public static TitreButton Reponse = new TitreButton("Reponse");
	public static TitreButton propos = new TitreButton("A propos");

	public Menu(String m) {
		unsetfocus();
		crypter.focus();
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(50, 500));
		this.add(Box.createVerticalGlue());
		this.add(crypter);
		this.add(Box.createVerticalGlue());
		this.add(Decripte);
		this.add(Box.createVerticalGlue());
		this.add(Etape);
		this.add(Box.createVerticalGlue());
		this.add(Reponse);
		this.add(Box.createVerticalGlue());
		this.add(propos);
		this.add(Box.createVerticalGlue());

		// Decripte.setEnabled(false);
		 Etape.setEnabled(false);
		crypter.addActionListener(action);
		Decripte.addActionListener(action);
		Etape.addActionListener(action);
		Reponse.addActionListener(action);
		propos.addActionListener(action);
	}

	public void bon() {
		Decripte.setEnabled(true);
		Etape.setEnabled(true);
	}

	public static void unsetfocus() {
		crypter.setBackground(Color.white);
		Decripte.setBackground(Color.white);
		Etape.setBackground(Color.white);
		Reponse.setBackground(Color.white);
		propos.setBackground(Color.white);

		crypter.setForeground(Color.black);
		Decripte.setForeground(Color.black);
		Etape.setForeground(Color.black);
		Reponse.setForeground(Color.black);
		propos.setForeground(Color.black);

	}

	public static ActionListener action = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			unsetfocus();
			if (e.getSource() == crypter) {
				Frame.splitPane.setRightComponent(new Crypter());
				crypter.focus();
			} else
			if (e.getSource() == Decripte) {
				Frame.splitPane.setRightComponent(new Decryter());
				Decripte.focus();
			} else
			if (e.getSource() == Etape) {
				Frame.splitPane.setRightComponent(new Crypter());
				Etape.focus();
			} else
			if (e.getSource() ==propos) {
				Frame.splitPane.setRightComponent(new Propos());
				propos.focus();
			} else if (e.getSource() == Reponse) {
				Reponse.focus();
				Frame.splitPane.setRightComponent(new Propos());
			}

		}

	};

}
