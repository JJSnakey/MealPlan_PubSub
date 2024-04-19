package project460eclipse;
import javax.swing.*;

/*
Joshua Greer 1218576515
CSE 460 Project
4/22/2024

this label class is my way of standardizing the JTextField
this object reduces code repitition in GUI
*/

public class textBox extends JTextField{
	
	//standardize the textboxes
	textBox(int x1, int y1){
		this.setBounds(x1,y1,200,50);
	}
	
}
