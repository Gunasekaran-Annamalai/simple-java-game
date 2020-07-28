package com.luck;

import java.util.Random;
import java.util.Scanner;

public class enterGame {
	
	Random rand = new Random();
	public int rand1 = rand.nextInt(5);
	public int number;
	public int value = 0;
	public int steps = 0;
	
	public void rules() {
		
		steps++;
		System.out.println("Enter any number between 1-6");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		for(int i = 0; i < number; i++) {
			value += rand1+1;
		}
		if (value < 100) {
			rules();
		}
	}
}
