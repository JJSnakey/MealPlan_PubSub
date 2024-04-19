package project460eclipse;
import javax.swing.*;

/*
Joshua Greer 1218576515
CSE 460 Project
4/22/2024

this label class is my way of standardizing the Jlabels
this object reduces code repitition in GUI
*/

public class label extends JLabel{
	
	//constructor
	label(String text, int x1, int y1){
		this.setText(text);
		this.setBounds(x1, y1, 200, 50);
	}
}
