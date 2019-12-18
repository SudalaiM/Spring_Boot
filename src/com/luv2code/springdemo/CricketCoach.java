package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String team;

	// create a no-arg constructor

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor ");
	}

	// out setter method
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("CricketCoach: inside setter method -  setFortuneService");

		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Pratice fast bowling for 20 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method -  setEmailAddress");

		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method -  setTeam");

		this.team = team;
	}
	
	

}
