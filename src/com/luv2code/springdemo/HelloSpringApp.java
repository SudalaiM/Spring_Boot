package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// retrieve bean from spring container
		Coach coach = applicationContext.getBean("mycoach", Coach.class);
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		// let's call our new method for fortunes
		System.out.println(coach.getDailyFortune());
		// close the context
		applicationContext.close();
	}

}
