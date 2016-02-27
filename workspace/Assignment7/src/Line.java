import java.awt.*;


public class Line {
	private int x1,x2,y1,y2;
	private Color color;
	
	
	
	public Line(int px1, int py1, int px2, int py2, Color pColor) // constructor that sets the color of the line as well as the coordinates
	{
		x1 = px1;
		y1 = py1;
		x2 = px2;
		y2 = py2;
		color = pColor;
		
	}
	
	public void draw(Graphics page)
	{
		page.setColor(color);// insert user color
		page.drawLine(x1, y1, x2, y2);
         
	}
	
	
}
