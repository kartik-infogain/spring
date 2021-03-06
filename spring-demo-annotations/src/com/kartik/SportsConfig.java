<<<<<<< HEAD
package com.kartik;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.kartik")
@PropertySource("classpath:sports.properties")
public class SportsConfig {
	
	@Bean
	public FortuneService fortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		SwimCoach coach = new SwimCoach(fortuneService());
		return coach;
	}
}
=======
package com.kartik;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.kartik")
@PropertySource("classpath:sports.properties")
public class SportsConfig {
	
	@Bean
	public FortuneService fortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		SwimCoach coach = new SwimCoach(fortuneService());
		return coach;
	}
}
>>>>>>> ee61d503e6b3e08da756937c30fc01d282638335
