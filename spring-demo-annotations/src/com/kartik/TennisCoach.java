package com.kartik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("tennisCoach") when the Bean ID is custom

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// Constructor Injection
	// @Autowired // Here too
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TennisCoach() {
		super();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	// Setter injection
	// @Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	// Method Injection
	/*@Autowired
	public void doStuff(FortuneService fortuneService) {
		System.out.println(">> Inside doStuff()");
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Tennis practice with Sania Mirza.. hahaha!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
