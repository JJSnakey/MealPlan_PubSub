package project460eclipse;
import java.awt.Color;

import javax.swing.*;
/*
Joshua Greer 1218576515
CSE 460 Project
4/22/2024

this checkbox class is my way of standardizing the JCheckBox
this object reduces code repitition in GUI
*/

public class checkBox extends JCheckBox{
	
	//constructor
	checkBox(int x1, int y1){
		this.setBounds(x1, y1, 20, 20);
		this.setBackground(new Color(200,200,200));
		this.setBorder(getBorder());
	}
	
}
