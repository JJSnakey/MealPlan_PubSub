package project460eclipse;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
Joshua Greer 1218576515
CSE460 Project/
4/22/2024

User interface to interact with Message Broker
has textboxes for input
has buttons for functions

output box? or maybe nust terminal

allows publisher to publish
allows subscriber to subscribe or unsubscribe
*/

public class GUI extends JFrame implements ActionListener{
	
	//pub side
	label usernameLabel = new label("username:", 10, 0);
	label ctLabel = new label("cuisine type:", 10, 20);
	label mealNameLabel = new label("meal name:", 10, 40);
	label tomLabel = new label("time of meal:", 10, 60);
	label domLabel = new label("day of meal:", 10, 80);
	
	textBox usernameBox = new textBox(10,0);
	textBox ctBox = new textBox(10,20);
	textBox mealNameBox = new textBox(10,40);
	textBox tomBox = new textBox(10,60);
	textBox domBox = new textBox(10,80);
	
	JButton publishButton;
	
	//sub side
	label usernameLabel2 = new label("username:", 250, 0);
	label ctoiLabel = new label("cuisine type of interest:", 250, 20);
	label dailyLabel = new label("daily:", 250, 40);
	label weeklyLabel = new label("weekly:", 250, 60);

	textBox usernameBox2 = new textBox(310,0);
	textBox ctoiBox = new textBox(310,20);
	
	checkBox dailyBox = new checkBox(310, 60);
	checkBox weeklyBox = new checkBox(310, 80);
	
	JButton subscribeButton;
	
	//other
	label outputLabel = new label("Output displayed in terminal", 10, 180);

	
	
	//constructor, main creates a GUI
	GUI(){
		//window stuff
		this.setTitle("Joshua Greer's 460 Project");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,600,300);
		this.setLayout(null);	//necessary for JPanels
		this.setResizable(false);
		this.getContentPane().setBackground(new Color(140,140,140));
		this.setVisible(true);
		
		//labels and textboxes
		this.add(outputLabel);
		
		//pub side
		this.add(usernameLabel);
		this.add(ctLabel);
		this.add(mealNameLabel);
		this.add(tomLabel);
		this.add(domLabel);
		
		this.add(usernameBox);
		this.add(ctBox);
		this.add(mealNameBox);
		this.add(tomBox);
		this.add(domBox);
		
		//sub side
		this.add(usernameLabel2);
		this.add(ctoiLabel);
		this.add(dailyLabel);
		this.add(weeklyLabel);
		
		this.add(usernameBox2);
		this.add(ctoiBox);
		
		this.add(dailyBox);
		this.add(weeklyBox);

		
		//buttons and function calls
		publishButton = new JButton("publish");
		publishButton.setBounds(10,130,100,30);
		publishButton.addActionListener(this);
		this.add(publishButton);
		
		subscribeButton = new JButton("subscribe");
		subscribeButton.setBounds(250,130,100,30);
		subscribeButton.addActionListener(this);
		this.add(subscribeButton);
	}

//for button use later
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==publishButton) {
			System.out.println("1");
		}
		if(e.getSource()==subscribeButton) {
			System.out.println("2");
		}
	}
	
}
