package Component;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import Utils.Constans;

@SuppressWarnings("serial")
public class Frame extends JFrame {

	public static JSplitPane splitPane;

	Label title = new Label(Constans.title, 30);

	public Frame() {
		super(Constans.frametitle);

		this.add(title);
	    this.setSize(Constans.framewidh, Constans.framehight);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.white);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);

	}

	public Frame(JPanel panel1, JPanel panel2) {
		this();
		JPanel container = new JPanel();

		container.setLayout(new BorderLayout());
		this.getContentPane().add(container);
		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setLeftComponent(panel2);
		panel2.setPreferredSize(new Dimension(250,Constans.framehight-100));
		splitPane.setRightComponent(panel1);
		splitPane.setOneTouchExpandable(true);
		splitPane.setResizeWeight(Constans.seperationPercentage);
		container.add(splitPane);
	}
}
