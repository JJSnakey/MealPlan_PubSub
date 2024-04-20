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
=========================================================================================================================
*/

public class GUI extends JFrame implements ActionListener{
	
	//pub side
	label pub = new label("Publisher:", 10, 0);
	
	label usernameLabel = new label("username:", 10, 30);
	label pubDailyLabel = new label("daily:", 10, 50);
	label pubWeeklyLabel = new label("weekly:", 10, 70);
	label mealNameLabel = new label("meal name:", 10, 90);
	label ctLabel = new label("cuisine type:", 10, 110);
	label cookTimeLabel = new label("cook time:", 10, 130);
	label tomLabel = new label("time of meal:", 10, 150);
	label domLabel = new label("day of meal:", 10, 170);
	
	
	textBox usernameBox = new textBox(10,30);
	checkBox pubDailyBox = new checkBox(10, 50);
	checkBox pubWeeklyBox = new checkBox(10, 70);
	textBox mealNameBox = new textBox(10,90);
	textBox ctBox = new textBox(10,110);
	textBox cookTimeBox = new textBox(10,130);
	textBox tomBox = new textBox(10,150);
	textBox domBox = new textBox(10,170);
	
	JButton publishButton;
	
	//sub side
	label sub = new label("Subscriber:", 250, 0);
	label usernameLabel2 = new label("username:", 250, 30);
	label dailyLabel = new label("daily:", 250, 50);
	label weeklyLabel = new label("weekly:", 250, 70);
	label ctoiLabel = new label("cuisine type of interest:", 250, 90);

	textBox usernameBox2 = new textBox(250,30);
	checkBox dailyBox = new checkBox(250, 50);
	checkBox weeklyBox = new checkBox(250, 70);
	textBox ctoiBox = new textBox(310,90);
	
	JButton subscribeButton;
	JButton UnsubscribeButton;
	
	//other
	label outputLabel = new label("Output displayed in terminal", 10, 260);
	label noteLabel = new label("If buttons do not immediately appear, wave mouse around window", 10, 280);
	
	
	//constructor, main creates a GUI======================================================================================
	GUI(){
		//window stuff
		this.setTitle("Joshua Greer's 460 Project");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,600,400);
		this.setLayout(null);	//necessary for JPanels
		this.setResizable(false);
		this.getContentPane().setBackground(new Color(140,140,140));
		this.setVisible(true);
		
		//labels and textboxes
		this.add(outputLabel);
		this.add(noteLabel);
		this.add(pub);
		this.add(sub);
		
		//pub side
		this.add(usernameLabel);
		this.add(pubDailyLabel);
		this.add(pubWeeklyLabel);
		this.add(mealNameLabel);
		this.add(ctLabel);
		this.add(cookTimeLabel);
		this.add(tomLabel);
		this.add(domLabel);
		
		this.add(usernameBox);
		this.add(pubDailyBox);
		this.add(pubWeeklyBox);
		this.add(mealNameBox);
		this.add(ctBox);
		this.add(cookTimeBox);
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
		publishButton.setBounds(10,220,100,30);
		publishButton.addActionListener(this);
		this.add(publishButton);
		
		subscribeButton = new JButton("subscribe");
		subscribeButton.setBounds(250,150,100,30);
		subscribeButton.addActionListener(this);
		this.add(subscribeButton);
		
		UnsubscribeButton = new JButton("unsubscribe");
		UnsubscribeButton.setBounds(400,150,120,30);
		UnsubscribeButton.addActionListener(this);
		this.add(UnsubscribeButton);
	}

	//functions============================================================================================================
	
	public void subscribe(String username, String cuisine, boolean daily) {
		System.out.println("Subcribed for:");
		System.out.println(username);
		System.out.println(cuisine);
		if(daily) {
			System.out.println("daily notification");
		}
		else {
			System.out.println("weekly notification");
		}
	}
	
	public void unsubscribe(String username, String cuisine, boolean daily) {
		System.out.println("Unsubcribed from:");
		System.out.println(username);
		System.out.println(cuisine);
		if(daily) {
			System.out.println("daily notification");
		}
		else {
			System.out.println("weekly notification");
		}
	}
	
	//helper method, check if string matches list of acceptable inputs
	public boolean keyWordCheck(String toCheck, String[] Valids) {
		
		for(int i=0; i < Valids.length; i++) {
			if(Valids[i].equals(toCheck)) {
				return true;
			}
		}
		return false;
	}
	
	
//for button use
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// publish button===========================================================================================
		if(e.getSource()==publishButton) {
			System.out.println();
			System.out.println("pressed publish.......");
			System.out.println();
			
			//organize inputs
			String username = usernameBox.getText();
			boolean dailyPub = pubDailyBox.isSelected();
			boolean weeklyPub = pubWeeklyBox.isSelected();
			String mealName = mealNameBox.getText();
			String cuisineType = ctBox.getText();
			String cookTime = cookTimeBox.getText();
			String tom = tomBox.getText();
			String dom = domBox.getText();
			
			int convertCookTime = 0;
			boolean flag1 = true;	//necessary components
			boolean flag2 = true;	//optional tom
			boolean flag3 = true;	//optional dom
			
			//base checks
			if(username.length() == 0) {
				System.out.println("please enter a valid username");
				flag1 = false;
			}
			if(dailyPub == weeklyPub) {
				System.out.println("please check a single box");
				flag1 = false;
			}
			if(mealName.length() == 0) {
				System.out.println("please enter a valid meal name");
				flag1 = false;
			}
			if(cuisineType.length() == 0) {
				System.out.println("please enter a valid cuisine type");
				flag1 = false;
			}
			if(cookTime.length() <= 0) {
				System.out.println("please enter a valid cook time in minutes");
				flag1 = false;
			}
			if(cookTime.length() > 0) {
				try {
					convertCookTime = Integer.parseInt(cookTime);
				}
				catch(Exception ed){
					System.out.println("cook time must be an integer");
				}
				
			}
			
			//optional checks
			if(tom.length() == 0) {
				//System.out.println("please enter a valid time of meal");
				flag2 = false;
			}
			if(tom.length() > 0) {
				String[] list = {"breakfast", "Breakfast", "lunch", "Lunch", "dinner", "Dinner"};
				flag2 = keyWordCheck(tom, list);
				if(flag2 == false) {
					System.out.println("invalid time of meal");
				}
			}
			
			if(dom.length() == 0) {
				//System.out.println("please enter a valid day of meal");
				flag3 = false;
			}
			if(dom.length() > 0) {
				String[] list = {"sunday", "Sunday", "monday", "Monday", "tuesday", "Tuesday", "wednesday", "Wednesday", "thursday", "Thursday", "friday", "Friday", "saturday", "Saturday"};
				flag3 = keyWordCheck(dom, list);
				if(flag3 == false) {
					System.out.println("invalid day of meal");
				}
			}
			
			//if checks are all good
			if(flag1 == true && flag2 == true && flag3 == true) {
				Meal meal = new Meal(username, dailyPub, mealName, cuisineType, convertCookTime, tom, dom);
				MessageBroker.meals.add(meal);
				MessageBroker.printMealPublish(meal);
			}
			//if some optional checks are missing
			else if(flag1 == true && flag2 == true && flag3 == false) {
				Meal meal = new Meal(username, dailyPub, mealName, cuisineType, convertCookTime, tom);
				MessageBroker.meals.add(meal);
				MessageBroker.printMealPublish(meal);
				
			}
			else if(flag1 == true && flag2 == false && flag3 == true) {
				Meal meal = new Meal(username, dailyPub, mealName, cuisineType, convertCookTime, dom);
				MessageBroker.meals.add(meal);
				MessageBroker.printMealPublish(meal);
			}
			else if(flag1 == true && flag2 == false && flag3 == false) {
				Meal meal = new Meal(username, dailyPub, mealName, cuisineType, convertCookTime);
				MessageBroker.meals.add(meal);
				MessageBroker.printMealPublish(meal);
			}
			
		}
		
		// subscribe button=====================================================================================================
		if(e.getSource()==subscribeButton) {
			System.out.println();
			System.out.println("pressed subscribe.......");
			System.out.println();
			
			//organize inputs
			String username = usernameBox2.getText();
			String cuisineType = ctoiBox.getText();
			boolean dayChecked = dailyBox.isSelected();
			boolean weekChecked = weeklyBox.isSelected();
			boolean flag1 = true;
			
			//perform checks
			if(username.length() == 0) {
				System.out.println("please enter a valid username");
				flag1 = false;
			}
			if(!dayChecked && !weekChecked && cuisineType.length() == 0) {
				System.out.println("please check a single box or enter a cuisine type");
				flag1 = false;
			}
			if(dayChecked && weekChecked) {
				System.out.println("please check a single box or no boxes");
				flag1 = false;
			}
			
			if(flag1) {
				Subscriber sub = new Subscriber(username, cuisineType, dayChecked, weekChecked);
				MessageBroker.subs.add(sub);
				MessageBroker.printNewSub(sub);
			}
			
		}
		
		// Unsubscribe button=====================================================================================================
		if(e.getSource()==UnsubscribeButton) {
			System.out.println();
			System.out.println("pressed unsubscribe.......");
			System.out.println();
			
			//organize inputs
			String username = usernameBox2.getText();
			String cuisineType = ctoiBox.getText();
			boolean dayChecked = dailyBox.isSelected();
			boolean weekChecked = weeklyBox.isSelected();
			boolean flag1 = true;
			
			//perform checks
			if(username.length() == 0) {
				System.out.println("please enter a valid username");
				flag1 = false;
			}
			if(!dayChecked && !weekChecked && cuisineType.length() == 0) {
				System.out.println("please check a single box or enter a cuisine type");
				flag1 = false;
			}
			if(dayChecked && weekChecked) {
				System.out.println("please check a single box or no boxes");
				flag1 = false;
			}
			
			if(flag1) {
				Subscriber sub = new Subscriber(username, cuisineType, dayChecked, weekChecked);
				MessageBroker.subs.add(sub);
				MessageBroker.printUnSub(sub);
			}
			
		}
		
	}
	
}
/*=====================================================================================================================
testing



*/