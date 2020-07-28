package com.luck;

public class Main {
	
	public static void main(String[] args) {
		
		// main object
		@SuppressWarnings("unused")
		Main main = new Main();
		
		// getting player info and greeting
		info getInfo = new info();
		getInfo.greeting(getInfo.getName(), getInfo.getGender());
		
		// game play
		enterGame eg = new enterGame();
		eg.rules();
		System.out.println("You ran upto " + eg.steps + " steps" );
	}

}
