// Assignment #: 6
//         Name: Zach Lee
//    StudentID: 1203992720
//      Lecture: Tues/Thurs 430pm
//  Description: Formats the create project panel and updates the information with the button

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



import java.util.*;

public class CreatePanel extends JPanel
 {
   private Vector projectList;
   private JButton button1;
   private ProjectSpendingPanel spendingPanel;
   private TextField field1,field2,field3,field4;
   private JLabel nameLabel,numberLabel,locationLabel,fundingLabel,messageLabel,space;
   private JPanel leftPanel, rightPanel;
   private JTextArea text1;
   

 //Constructor initializes components and organize them using certain layouts
 public CreatePanel(Vector projectList, ProjectSpendingPanel spendingPanel)
  {
    this.projectList = projectList;
    this.spendingPanel = spendingPanel;
    
    messageLabel = new JLabel("Project added.");
    messageLabel.setForeground(Color.RED);
    messageLabel.setVisible(false);
    nameLabel = new JLabel("Project Name");
    numberLabel = new JLabel("Project Number");
    fundingLabel = new JLabel("Initial Funding");
    locationLabel = new JLabel("Project Location");
    space = new JLabel(" ");
    
    field1 = new TextField();
    field2 = new TextField();
    field3 = new TextField();
    field4 = new TextField();
    
    text1 = new JTextArea(); // creates text field for the project text
    text1.setText("No Project");
    button1 = new JButton("Create a project"); // creates button 
    
    
    leftPanel = new JPanel();
    leftPanel.setLayout(new GridLayout(6,2)); // creates a gridLayout panel 
    leftPanel.add(messageLabel); //adds to 1,1
    leftPanel.add(space); // adds to 1,2
    leftPanel.add(nameLabel); // adds to 2,1
    leftPanel.add(field1); // adds to 2,2
    leftPanel.add(numberLabel); // adds to 3,1
    leftPanel.add(field2); // adds to 3,2
    leftPanel.add(fundingLabel); // adds to 4,1
    leftPanel.add(field3); // adds to 4,2
    leftPanel.add(locationLabel);
    leftPanel.add(field4);
    leftPanel.add(button1, BorderLayout.SOUTH);
    
    rightPanel = new JPanel(); // creates right panel object
    rightPanel.setLayout(new BorderLayout()); // sets the layout to type Border Layout
    rightPanel.add(new JScrollPane(text1)); // adds a scroll bar
    
    setLayout(new GridLayout(1,2)); // creates the initial crate project panel and adds the left and right panels to the columns
    add(leftPanel); // adds left panel to the left
    add(rightPanel);  // adds right panel to the right
    
    button1.addActionListener( new ButtonListener());
    
  }


  //ButtonListener is a listener class that listens to
  //see if the buttont "Create a project" is pushed.
  //When the event occurs, it adds a project information from
  //the text fields to the text area. It also creates a Project object
  //using the information and add it to the projectList.
  //It also does error checking.
  private class ButtonListener implements ActionListener
   {
    public void actionPerformed(ActionEvent event)
     {
    	String str1 = field1.getText();
    	String str2 = field2.getText();
    	String str3 = field3.getText();
    	String str4 = field4.getText();
    	
    	try
    	{
    		if(str1.equals("")||str2.equals("")||str3.equals("")||str4.equals("")){ // error check for empty fields
    			messageLabel.setText("Please add data to empty space(s)");
    			messageLabel.setVisible(true);
    		}
    		else{
    			int number = Integer.parseInt(str2); // parses string to int
    			double intFund = Double.parseDouble(str3); // parses string to double
    			Project proj = new Project(intFund); //creates Project object to pass intFund into
    			proj.setName(str1);
    			proj.setNumber(number);
    			proj.setLocation(str3);
    			projectList.addElement(proj); // adds project to the vector
    			messageLabel.setText("Project added, great job!"); // output for adding project
    			messageLabel.setVisible(true);
    			
    				for(int i = 0; i<projectList.size(); i++) // outputs string of the project
    				{
    					text1.append(projectList.get(i).toString());
    				}
    				spendingPanel.updateProjectList(); // update vector
    			}
    		
    	}
    	catch(NumberFormatException ex){
    		messageLabel.setText("Please enter a number ya pansy"); // error check for number field
    		messageLabel.setVisible(true);
    	}

       // if there is no error, add a project to project list
       // otherwise, show an error message

     } //end of actionPerformed method
  } //end of ButtonListener class

} //end of CreatePanel class
