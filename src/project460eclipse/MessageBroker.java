package project460eclipse;
import java.io.*;
import java.util.ArrayList;

/*
Joshua Greer 1218576515
CSE460 Project/
4/22/2024

MessageBroker object will remember all the published meals
publishers will submit meals
notify subscribers when the meal they search for is published
stop notifying subscribers when unsubscribe

publishers don't really need to be remembered, their ID can just be attached to the meal
*/

public class MessageBroker {
	
	static ArrayList<Meal> meals;
	//ArrayList<Publisher> pubs;
	static ArrayList<Subscriber> subs;
	
	//constructor, initialize on start
	MessageBroker(){
		meals = new ArrayList<Meal>();
		//pubs = new ArrayList<Publisher>();
		subs = new ArrayList<Subscriber>();
	}
	
	//add sub--------------------------------------------------------------------------------
	public void attachSubscriber() {
		
	}
	//remove sub
	public static boolean detachSubscriber(String username1) {
		for(int i = 0; i<subs.size(); i++) {
			if(subs.get(i).username.equals(username1)) {
				subs.remove(i);
				return true;
			}
		}
		return false;
	}
	
	//function to notify subscribers--------------------------------------------------------
	public void notifySubscribers() {
		
	}
	
	
	//print function bb=================================================================================================
	public static void printMealPublish(Meal meal) {
		
		boolean flag1 = meal.daily;	//daily or weekly
		boolean flag2 = false;		//do we have tom
		boolean flag3 = false;		//do we have dom
		
		if(meal.timeOfMeal != null) {
			flag2 = true;
		}
		if(meal.dayOfMeal != null) {
			flag3 = true;
		}
		
		if(flag2 == true && flag3 == true) {
			//print with tom and dom
			if(flag1) {
				System.out.println("publish, " + meal.publisherName + ", dailyMeal, " + meal.mealName + ", " + meal.timeToCook + " minutes, " + meal.timeOfMeal + ", " + meal.dayOfMeal);	
			}
			else {
				System.out.println("publish, " + meal.publisherName + ", weeklyMeal, " + meal.mealName + ", " + meal.timeToCook + " minutes, " + meal.timeOfMeal + ", " + meal.dayOfMeal);	
			}
		}
		if(flag2 == true && flag3 == false) {
			//print with tom
			if(flag1) {
				System.out.println("publish, " + meal.publisherName + ", dailyMeal, " + meal.mealName + ", " + meal.timeToCook + " minutes, " + meal.timeOfMeal);	
			}
			else {
				System.out.println("publish, " + meal.publisherName + ", weeklyMeal, " + meal.mealName + ", " + meal.timeToCook + " minutes, " + meal.timeOfMeal);	
			}
		}
		if(flag2 == false && flag3 == true) {
			//print with dom
			if(flag1) {
				System.out.println("publish, " + meal.publisherName + ", dailyMeal, " + meal.mealName + ", " + meal.timeToCook + " minutes, " + meal.dayOfMeal);	
			}
			else {
				System.out.println("publish, " + meal.publisherName + ", weeklyMeal, " + meal.mealName + ", " + meal.timeToCook + " minutes, " + meal.dayOfMeal);	
			}
		}
		if(flag2 == false && flag3 == false) {
			//print with no optionals
			if(flag1) {
				System.out.println("publish, " + meal.publisherName + ", dailyMeal, " + meal.mealName + ", " + meal.timeToCook + " minutes");	
			}
			else {
				System.out.println("publish, " + meal.publisherName + ", weeklyMeal, " + meal.mealName + ", " + meal.timeToCook + " minutes");	
			}
		}
		
	}
	
	// new sub print bb =========================================================================================================================================
	public static void printNewSub(Subscriber sub) {
		boolean flag1 = false;	//do we have a cuisine
		
		if(sub.cuisineInterest.length() > 0) {
			flag1 = true;
		}
		
		if(flag1 == false) {
			if(sub.dayCheck) {
				System.out.println("subscribe, " + sub.username + ", dailyMeals");
			}
			if(sub.weekCheck) {
				System.out.println("subscribe, " + sub.username + ", weeklyMeals");
			}
		}
		if(flag1 == true) {
			if(sub.dayCheck) {
				System.out.println("subscribe, " + sub.username + ", dailyMeals"+ ", " + sub.cuisineInterest);
			}
			if(sub.weekCheck) {
				System.out.println("subscribe, " + sub.username + ", weeklyMeals"+ ", " + sub.cuisineInterest);
			}
			if(!sub.dayCheck && !sub.weekCheck) {
				System.out.println("subscribe, " + sub.username + ", " + sub.cuisineInterest);
			}
		}
		
	}
	
	// unsub print bb =========================================================================================================================================
		public static void printUnSub(String username, String cuisineType, boolean dayCheck, boolean weekCheck) {
			boolean flag1 = false;	//do we have a cuisine
			
			if(cuisineType.length() > 0) {
				flag1 = true;
			}
			
			if(flag1 == false) {
				if(dayCheck) {
					System.out.println("unsubscribe, " + username + ", dailyMeals");
				}
				if(weekCheck) {
					System.out.println("unsubscribe, " + username + ", weeklyMeals");
				}
			}
			if(flag1 == true) {
				if(dayCheck) {
					System.out.println("unsubscribe, " + username + ", dailyMeals"+ ", " + cuisineType);
				}
				if(weekCheck) {
					System.out.println("unsubscribe, " + username + ", weeklyMeals"+ ", " + cuisineType);
				}
				if(!dayCheck && !weekCheck) {
					System.out.println("unsubscribe, " + username + ", " + cuisineType);
				}
			}
			
		}
	
}
