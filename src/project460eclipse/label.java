package project460eclipse;
import javax.swing.*;

public class label extends JLabel{
	
	//constructor
	label(String text, int x1, int y1){
		this.setText(text);
		this.setBounds(x1, y1, 200, 50);
	}
}
