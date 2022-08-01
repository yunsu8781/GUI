import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BackgroundChange extends JFrame{
	private JButton button_yellow;
	private JButton button_pink;
	private JPanel panel;
	
	public BackgroundChange() {
		this.setSize(300, 200);
		this.setTitle("배경 바꾸기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		MyListener listener = new MyListener();
		
		button_yellow = new JButton("노란색");
		button_pink = new JButton("핑크색");
		
		button_yellow.addActionListener(listener);
		button_pink.addActionListener(listener);
		
		panel.add(button_yellow);
		panel.add(button_pink);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button_yellow) {
				panel.setBackground(Color.yellow);
			}else if(e.getSource() == button_pink) {
				panel.setBackground(Color.pink);
			}
		}
	}
	
}



