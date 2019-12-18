package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// create new object
		Coach baseballCoach = new TrackCoach();
		Coach coach = new BaseballCoach();
//
//		// use the object
		System.out.println(coach.getDailyWorkout() + "\n " + baseballCoach.getDailyWorkout());
	}

}
