package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// retrieve bean from spring container
		CricketCoach coach = applicationContext.getBean("myCricketCoach", CricketCoach.class);
		applicationContext.close();
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		/* call our new methods to get the literal value */
		
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());

	}

}
