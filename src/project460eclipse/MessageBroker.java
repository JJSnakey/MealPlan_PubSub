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
	public void detachSubscriber() {
		
	}
	
	/*
	Publishers don't really need to be remembered by the broker because they just send in messages
	and don't need notifications back
	
	//add pub
	public void attachPublisher() {
		
	}
	//remove pub
	public void detachPublisher() {
		
	}
	*/
	
	
	//function to notify subscribers--------------------------------------------------------
	public void notifySubscribers() {
		
	}
	
}
