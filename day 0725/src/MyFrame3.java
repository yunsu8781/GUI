import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame3 extends JFrame {
	public MyFrame3() {
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		add(new JButton("Center"), BorderLayout.CENTER);
		add(new JButton("Line Start"), BorderLayout.LINE_START);
		add(new JButton("Line End"), BorderLayout.LINE_END);
		add(new JButton("Page Start"), BorderLayout.PAGE_START);
		add(new JButton("Page End"), BorderLayout.PAGE_END);
		

		pack();
		setVisible(true);
	}
	

}
