import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame{

	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		this.add(button);
		setVisible(true);
	}
}
