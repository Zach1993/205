import javax.swing.*;

public class Dots extends JApplet {
	
	public void init(){
		getContentPane().add(new DotsPanel());
		setSize(300,300);
	}

}
