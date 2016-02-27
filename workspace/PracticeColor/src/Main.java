import javax.swing.*;
import java.awt.*;

public class Main extends JApplet {

	public void paint(Graphics page) {
		
		setBackground(Color.CYAN);
		page.setColor(Color.BLUE);
		page.fillRect(0, 175, 300, 50);
		page.setColor(Color.YELLOW);
		page.fillArc(-40, -40, 80, 80, 270, 70);
		page.fillOval(-40, -40, 80, 80);
		page.setColor(Color.WHITE);
		page.fillOval(65, 95, 30, 30);
		page.fillOval(60, 120, 40, 40);
		page.fillOval(50, 150, 60, 60);
		page.setColor(Color.BLACK);
		
		
		

	}

}
