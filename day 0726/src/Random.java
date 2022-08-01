import java.awt.Color;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Random extends JFrame{
	JPanel p = new JPanel();
	JLabel[] labels = new JLabel[30];
	
	public Random() {
		p.setLayout(null);
		p.setBackground(Color.yellow);
		
		for (int i = 0; i < 30; i++) {
			labels[i] = new JLabel("" + i);
			int x = (int) (500 * Math.random());
			int y = (int) (200 * Math.random());
			labels[i].setForeground(Color.magenta);
			labels[i].setLocation(x, y);
			labels[i].setSize(20, 20);
			p.add(labels[i]);
		}
		setSize(500, 300);
		add(p);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Random r = new Random();
	}
}


