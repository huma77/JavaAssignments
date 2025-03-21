package com.overload.quest2;

public class MessengerMain {

	public static void main(String[] args) {
		
		//Create an object of Messenger class  
		Messenger messenger = new Messenger();
		
		//Call the methods by passing the appropriate values 
		messenger.sendMail("Hello! This is general message");
		messenger.sendMail("/n huma@mail.com", "Hey Huma, hope you are doing well! ");
		messenger.sendMail("bobby@mail.com", "Meeting Reminder ", "Don't forget oue meeting at 1 pm ");
	}

}
