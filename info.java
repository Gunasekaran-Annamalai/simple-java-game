package com.luck;
import java.util.Scanner;

public class info {
	String name;
	String gender;
	
	Scanner input = new Scanner(System.in);
	
	public String getName() {
		System.out.println("Enter your name: ");
		name = input.nextLine();
		return name;
	}
	
	public String getGender() {
		System.out.println("Enter your gender (M/F): ");
		gender = input.nextLine();
		return gender;
	}
	
	public void greeting(String name, String gender) {
		System.out.println((gender.equals("male") || gender.equals("m")?"Welcome Mr. " + name : "Welcome Ms. " + name));
	}
}
