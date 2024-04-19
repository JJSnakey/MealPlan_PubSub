package project460eclipse;

/*
Joshua Greer 1218576515
CSE460 Project/
4/22/2024

Meal is the object we are going to store our information in
The MessageBroker will have an array of Meal for storage and reference
*/

public class Meal {
	
	String publisherName;
	boolean daily;			//true if daily, false if weekly
	String mealName;
	String cuisineType;
	int timeToCook;			//minutes
	String timeOfMeal;	//optional
	String dayOfMeal;	//optional
	
	//constructor for easy build
	Meal(String pubName, boolean freq, String mealName, String cuisine, int cook, String tom, String dom){
		this.publisherName = pubName;
		this.daily = freq;
		this.mealName = mealName;
		this.cuisineType = cuisine;
		this.timeToCook = cook;
		this.timeOfMeal = tom;	//optional
		this.dayOfMeal = dom;	//optional
	}
	
	//overloaded constructors for easy build
	Meal(String pubName, boolean freq, String mealName, String cuisine, int cook, String tom){
		this.publisherName = pubName;
		this.daily = freq;
		this.mealName = mealName;
		this.cuisineType = cuisine;
		this.timeToCook = cook;
		this.timeOfMeal = tom;	//optional
	}
	Meal(String pubName, boolean freq, String mealName, String cuisine, String dom , int cook){
		this.publisherName = pubName;
		this.daily = freq;
		this.mealName = mealName;
		this.cuisineType = cuisine;
		this.timeToCook = cook;
		this.dayOfMeal = dom;	//optional
	}
	Meal(String pubName, boolean freq, String mealName, String cuisine, int cook){
		this.publisherName = pubName;
		this.daily = freq;
		this.mealName = mealName;
		this.cuisineType = cuisine;
		this.timeToCook = cook;
	}
		
}
