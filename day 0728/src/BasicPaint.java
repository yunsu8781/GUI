import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;

public class BasicPaint {
	public static void main(String[] args) {
		JFrame f = new JFrame("그래픽 기초 프로그램");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
 class MyPanel extends JPanel{
	 public MyPanel() {
		 JPanel panel = new JPanel();
		 setBorder(BorderFactory.createLineBorder(Color.black));
	 }
	 public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 g.drawRect(50, 50, 50, 50);
		 g.drawOval(200, 50, 50, 50);
	 }
 }