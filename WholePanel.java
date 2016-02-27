// Assignment #: 7
//         Name: your name
//    StudentID: your id
//      Lecture: your lecture days/time
//  Arizona State University CSE205
//  Description: It needs to be filled.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class WholePanel extends JPanel
{
   private Color currentColor;
   private CanvasPanel canvas;
   private JPanel leftPanel;
   private JButton undo,erase;
   private ArrayList<Line> lineList,drag,listRestore;
   private Point ptStart,ptEnd, ptDrag;
   private JRadioButton black,red,blue,green,orange;
   
  

   
   
   public WholePanel()
   {
      
      currentColor = Color.black; 
      lineList = new ArrayList();
      drag = new ArrayList();
      listRestore = new ArrayList();
      
      
      undo = new JButton ("Undo"); // undo button
      erase = new JButton("Erase"); // Erase button
      black = new JRadioButton("Black"); black.setSelected(true); // setting black to the default line color
      red = new JRadioButton("Red");
      blue = new JRadioButton("Blue");
      green = new JRadioButton("Green");
      orange = new JRadioButton("Orange");
      
      ButtonGroup group = new ButtonGroup(); // added buttons to group so only one can be selected at a time
      group.add(black);
      group.add(red);
      group.add(blue);
      group.add(green);
      group.add(orange);
      
      leftPanel = new JPanel(); // creates new JPanel that I can use to set the grid layout in and add the radio buttons
      leftPanel.setLayout(new GridLayout(7,1));
      leftPanel.add(black);
      leftPanel.add(red);
      leftPanel.add(blue);
      leftPanel.add(green);
      leftPanel.add(orange);
      
      leftPanel.add(undo); // adds the undo button to the left panel above the erase button
      leftPanel.add(erase); // adds the erase button to the left panel at the bottom
      
      
      canvas = new CanvasPanel(); // creates the canvas panel
      
      

      JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, canvas); // splits the applet layout into two panels
      setLayout(new BorderLayout());
      add(sp);
      
      undo.addActionListener( new ButtonListener()); // adding listener action for undo and erase buttons
      erase.addActionListener( new ButtonListener());
      
      black.addActionListener( new ComboListener()); // adding listener actions for radio buttons
      red.addActionListener( new ComboListener());
      blue.addActionListener( new ComboListener());
      green.addActionListener( new ComboListener());
      orange.addActionListener( new ComboListener());
      
      canvas.addMouseListener(new PointListener()); 
      canvas.addMouseMotionListener(new PointListener()); 
      
    
   
    }

  //CanvasPanel is the panel where shapes will be drawn
  private class CanvasPanel extends JPanel
   {
      //this method draws all shapes specified by a user
      public void paintComponent(Graphics page)
       {
        super.paintComponent(page);
        setBackground(Color.WHITE);
        
        
        for(int i = 0; i< drag.size(); i++){
        	(drag.get(i)).draw(page); // draws line for drag while user drags line
        	drag.clear(); // clears the array after every iteration so that the line that is drawn is deleted
        	}
        
        for(int i = 0; i< lineList.size(); i++){
        	(lineList.get(i)).draw(page); // draws line upon release of mouse button
        	}
       }
    } //end of CanvasPanel class


   //ButtonListener defined actions to take in case
   //"Undo", or "Erase" is chosen.
   private class ButtonListener implements ActionListener
    {
      public void actionPerformed (ActionEvent event)
      {
    	  JButton source = (JButton)event.getSource();
    	  String name = source.getText();
    	  if (name.equals("Undo"))
    	  {
    		  
    		  if(lineList.size() > 0)
    		  {
    			  lineList.remove(lineList.size()-1);  
    		  }
    		  
    	  }
    	  else if (name.equals("Erase"))
    	  {
    		  lineList.clear();
    	  }
    	  
    	  repaint();
          
      }
   } // end of ButtonListener


   // listener class to set the color chosen by a user using
   // the color radio buttons
   private class ComboListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
         {
        	
        	JRadioButton src = (JRadioButton)event.getSource();
        	String name = src.getText();
        	if(name.equals("Black"))
        	{
        		currentColor = Color.BLACK;
        	}
        	else if (name.equals("Red"))
        	{
        		currentColor = Color.RED;
        	}
        	else if (name.equals("Blue"))
        	{
        		currentColor = Color.BLUE;
        	}
        	else if (name.equals("Green"))
        	{
        		currentColor = Color.GREEN;
        	}
        	else if (name.equals("Orange"))
        	{
        		currentColor = Color.ORANGE;
        	}
        	
         }
    } 


   // listener class that listens to the mouse
 
   public class PointListener implements MouseListener, MouseMotionListener 

    {
	 //in case that a user presses using a mouse,
	 //record the point where it was pressed.
     public void mousePressed (MouseEvent event)
      {
          ptStart = event.getPoint();
      }

     //mouseReleased method takes the point where a mouse is released,
     //using the point and the pressed point to create a line,
     //add it to the ArrayList "lineList", and call paintComponent method.
     public void mouseReleased (MouseEvent event)
      {
           ptEnd = event.getPoint();
           Line line = new Line(ptStart.x,ptStart.y,ptEnd.x,ptEnd.y,currentColor);
           lineList.add(line);
           repaint();
            
      }
     public void mouseClicked (MouseEvent event) {}
     public void mouseEntered (MouseEvent event) {}
     public void mouseExited (MouseEvent event) {}
    
     //mouseDragged method takes the point where a mouse is dragged
     //and call paintComponent method
     
     public void mouseDragged(MouseEvent event)
        {
    	  ptDrag = event.getPoint();
    	  Line dragLine = new Line(ptStart.x,ptStart.y,ptDrag.x,ptDrag.y,currentColor);
    	  drag.add(dragLine);
    	  canvas.repaint();
        }
        
     public void mouseMoved(MouseEvent event) {}
	    

    } // end of PointListener

} // end of Whole Panel Class
