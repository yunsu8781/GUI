
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = {
			"BackSpace", "", "","CE", "C",
			"7", "8","9","/","sqrt",
			"4", "5","6","x","%",
			"1","2","3","-","1/x",
			"0","+/-",".","+","="
	};
	
	public Calculator () {
		tField = new JTextField(35);
		panel = new JPanel();
		tField.setText("0.");
		tField.setEditable(false);
		
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int index = 0;
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if (cols >= 3) {
					buttons[index].setForeground(Color.red);
				}else
					buttons[index].setForeground(Color.blue);
					buttons[index].setBackground(Color.yellow);
					panel.add(buttons[index]);
					index++;				
			}
			
		}
	}
	public static void mian(String arge[]) {
		Calculator c = new Calculator();
	}
}
