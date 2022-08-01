import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame4 extends JFrame {

	JButton b1;
	private JButton b2, b3;
		
	public MyFrame4() {
		setTitle("Absolute Position Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		JPanel p = new JPanel();
		p.setLayout(null);
		
		b1 = new  JButton("Button #1");
		p.add(b1);
		b2 = new  JButton("Button #2");
		p.add(b2);
		b3 = new  JButton("Button #3");
		p.add(b3);
	}

	
	
}
