package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	public BaseballCoach() {

	}
//
	// define the private field for the dependency
	private FortuneService fortuneService;

	// define the constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "daily learn 2 hours in spring boot";
	}

	@Override
	public String getDailyFortune() {
		// use my FortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
