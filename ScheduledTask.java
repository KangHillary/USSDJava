package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
	
	@Scheduled(cron="*/4 * * * * *")
	public void pingEquity() {
		System.out.println("pingging...");
		
	}

}
