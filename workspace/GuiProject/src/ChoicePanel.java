import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChoicePanel extends JPanel{
	private JLabel whichYear;
	private JRadioButton year1,year2,year3,year4;
	
	public ChoicePanel() {
		whichYear = new JLabel("Freshman");
		year1 = new JRadioButton("1",true);
		year2 = new JRadioButton("2",true);
		year3 = new JRadioButton("3",true);
		year4 = new JRadioButton("4",true);
		
		ButtonGroup group = new ButtonGroup();
		group.add(year1);
		group.add(year2);
		group.add(year3);
		group.add(year4);
		
		add(year1);
		add(year2);
		add(year3);
		add(year4);
		add(whichYear);
		
		
		ChoiceListener listener = new ChoiceListener();
		year1.addActionListener(listener);
		year2.addActionListener(listener);
		year3.addActionListener(listener);
		year4.addActionListener(listener);
		
	}
	
	private class ChoiceListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event)
		{
			Object source = event.getSource(); // Tells you which radio button the user is using
			if(source==year1){
				whichYear.setText("Freshman");
			}
			else if (source==year2){
				whichYear.setText("Sophomore");
			}
			else if (source==year3){
				whichYear.setText("Junior");
			}
			else if (source==year4){
				whichYear.setText("Senior");}
			
		}
	}
}


