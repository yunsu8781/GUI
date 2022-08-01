import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class example_2 extends JFrame{
	JPanel p1;
	public void FlowExam() {
		setSize(300,200);
		setTitle("My Frame");
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		for (int i = 0; i < 10; i++) 
			p1.add(new JButton("Button" + i));
		add(p1);
		setVisible(true);
		
		
	}
}
