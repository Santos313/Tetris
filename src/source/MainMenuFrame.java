package source;

import javax.swing.JFrame;

public class MainMenuFrame extends Frame{
	
	public MainMenuFrame() {
		window.add(new MainMenuPanel());
		window.setVisible(true);

	}

	public static void main(String[] args) {
		new MainMenuFrame();
	}

}
