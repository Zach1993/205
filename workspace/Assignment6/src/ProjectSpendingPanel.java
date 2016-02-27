// Assignment #: 6
//         Name: Zach Lee
//    StudentID: 1203992720
//      Lecture: Tues/Thurs 430pm
//  Description: This class is to populate the project spending tab that will allow a user to add spending to certain projects
// 			     

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class ProjectSpendingPanel extends JPanel
 {
     private Vector projectList;
     private JButton addSpending;
     private JLabel amtSpend;
     private JLabel chooseProject;  
     private JTextField textField;
     private JList list;
     private JPanel panelTop;
     private JPanel panelBottom;
    


   //Constructor initialize each component and arrange them using
   //certain layouts
   public ProjectSpendingPanel(Vector projectList)
     {

	   
         this.projectList = projectList;
         list = new JList(this.projectList); // the list is populated by the projectList vector, top panel
         addSpending = new JButton("Add Spending"); // for the add spending button on the bottom right of pane, bottom panel
         amtSpend = new JLabel("Specify your amount to spend:"); // for the label to left of add spending button, top panel
         chooseProject = new JLabel("Choose a project to specify some spending:"); // label below project creation and project spending tabs, top panel
         textField = new JTextField(); // Text field to input new spending, bottom panel

         
         panelTop = new JPanel();
         panelTop.setLayout(new BorderLayout());
    
         panelTop.add(new JScrollPane(list));
         panelTop.add(chooseProject, BorderLayout.NORTH); // add label to applet, top panel

         
         //add(list); // add the list of projects from vector, top panel
        
         panelBottom = new JPanel();
         panelBottom.setLayout(new BorderLayout()); 
         
         panelBottom.add(amtSpend, BorderLayout.WEST); // add label to applet, bottom border
         panelBottom.add(textField, BorderLayout.SOUTH); // add the text field to applet to accept user input, bottom border
         panelBottom.add(addSpending, BorderLayout.EAST); // adds the spending button to the outlay, bottom border
         
        setLayout(new BorderLayout()); // creates panel for the projectSpendingPanel
        add(panelTop, BorderLayout.NORTH); // adds paneltop to the top
        add(panelBottom, BorderLayout.SOUTH); // adds panelBottom to the bottom
         
         
		addSpending.addActionListener( new ButtonListener()); // creates listener
         
         
     }



//This method  refreshes the JList with
 //updated vector information
 public void updateProjectList()
  {
	 list.updateUI(); // calls to updateUI so that Project list is updated whenever the vector is changed
      
  }

 
 
 //ButtonListener class listens to see the button "Add Spending" is pushed.
 //A user can choose which project to add spending, and that will update the
 //spending and current balance of such project.
 private class ButtonListener implements ActionListener
  {
       public void actionPerformed(ActionEvent event)
        {
    	   int i = list.getSelectedIndex();
    	   String str1 = textField.getText();
    	   double spend = Double.parseDouble(str1);
    	   
    	   ((Project) projectList.get(i)).addExpenditure(spend);
    	   list.updateUI();
    	   
    	   
    	   
    	   
    	   
          //get some additional spending from the textfield,
          //update the spending and current balance
          //for the chosen project in the JList.
        }
  } //end of ButtonListener class

} //end of ProjectSpendingPanel class
