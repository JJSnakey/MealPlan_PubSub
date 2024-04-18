package project460eclipse;

/*
Joshua Greer 1218576515
CSE460 Project/
4/22/2024

Meal is the object we are going to store our information in
The MessageBroker will have an array of Meal for storage and reference
*/

public class Meal {
	String cuisineType;
	String mealName;
	String timeOfMeal;
	int timeToCook;			//minutes
	boolean weekly;			//true if weekly, false if daily
	
	//constructor for easy build
	Meal(String cuisine, String name, String time, int cook, boolean freq){
		this.cuisineType = cuisine;
		this.mealName = name;
		this.timeOfMeal = time;
		this.timeToCook = cook;
		this.weekly = freq;
	}
}
