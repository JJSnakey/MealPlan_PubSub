package project460eclipse;

public class Subscriber {
	
	String username;
	String cuisineInterest;
	boolean dayCheck;
	boolean weekCheck;
	
	//constructor
	Subscriber(String name, String cuisineType, boolean day, boolean week){
		this.username = name;
		this.cuisineInterest = cuisineType;
		this.dayCheck = day;
		this.weekCheck = week;
	}
}
