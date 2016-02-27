

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;



public class DotsPanel extends JPanel {
	private ArrayList pointList;
	private int count;
	private final int RADIUS = 6;
	
	public DotsPanel() {
		pointList = new ArrayList();
		count = 0;
		setBackground(Color.BLACK);
		addMouseListener (new DotsListener());
		
	}
	
	
	private class DotsListener implements MouseListener {
		
		public void mousePressed(MouseEvent event){
			Point pt = event.getPoint();
			pointList.add(pt);
			count++;
			repaint(); // calls paintComponent method indirectly			
		}
		
		public void mouseReleased(MouseEvent event){
			
		}
		
		public void mouseClicked(MouseEvent event){
			
		}
		
		public void mouseEntered(MouseEvent event){
			
		}
		
		public void mouseExited(MouseEvent event){
			
		}	
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.setColor(Color.GREEN);
		for(int i = 0; i< pointList.size(); i++){
			Point pt1 = (Point)pointList.get(i);
			page.fillOval(pt1.x-RADIUS, pt1.y-RADIUS, 2*RADIUS, 2*RADIUS);
		}
		page.drawString("Count" + count, 5, 10);
	}
}
