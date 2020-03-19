package source;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class WindowFrame extends Frame {

	private static final KeyListener Board = null;

	public WindowFrame() {
		window.add(new Board());

		window.add(new GlassPane());
		window.setVisible(true);
		
		window.addKeyListener(Board);
	}

}
