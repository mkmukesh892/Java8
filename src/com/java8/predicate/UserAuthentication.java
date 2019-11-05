package com.java8.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User {
	 private String userName;
	 private String password;
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
 }
public class UserAuthentication {

	public static void main(String[] args) {
		Predicate<User> p = user->user.getUserName().equals("mukesh")&&user.getPassword().equals("java");
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter User Name");
		String userName = sc.next();
		System.out.println("Enter password");
		String password  =sc.next();
		User user = new User(userName, password);
		if(p.test(user))
			System.out.println("You are allowed to access Resource");
		else
			System.out.println("You are not allowed to access Resource");
		sc.close();

	}

}
