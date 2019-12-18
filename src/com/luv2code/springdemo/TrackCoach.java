package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "check code run and confirm ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do It : " + fortuneService.getFortune();
	}

}
