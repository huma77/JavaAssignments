package com.overload.quest2;

public class Messenger {
	//Param Constructor
	/*public Messenger(String message, String tousername, String subject) {
		this.message = message;
		this.tousername = toUsername;
		this.subject = subject;
		
	}*/
	// Because we are sending information through method overloading
	//void sendMail(String message){// add simple print stmts} 
	void sendMail(String message) {
		System.out.println("Sending Mail...");
		System.out.println("Message: " + message);
		System.out.println("Mail sent successfully! ");
	}
	
	//void sendMail(String toUsername, String message){// add simple print stmts} 
	void sendMail(String tousername, String message) {
		System.out.println("Sending Mail to " + tousername + "Huma" );
		System.out.println("Message: " + message);
		System.out.println("Mail sent successfully! ");
	}
	//void sendMail(String toUsername, String message,String subject){// add simple print stmts} 
	void sendMail(String tousername, String message, String subject){
		System.out.println("Sending Mail to " + tousername + "Bobby" );
		System.out.println("Message: " + message);
		System.out.println("Mail sent successfully! ");
	}
}

