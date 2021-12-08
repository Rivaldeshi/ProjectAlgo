package Views;
import javax.swing.JFrame;
import Component.Frame;
import View.Crypter;
import View.Menu;

public class MainView  {

	public Frame frame;

	public MainView() {

		frame = new Frame( new Crypter(),new Menu(""));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();
		frame.setVisible(true);

	}
}
