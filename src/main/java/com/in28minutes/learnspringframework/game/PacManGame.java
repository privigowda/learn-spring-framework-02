package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole{

	public void up()
	{
		System.out.println("Upside");
	}
	
	public void down()
	{
		System.out.println("Downside");
	}
	
	public void left()
	{
		System.out.println("Go left");
	}
	
	public void right()
	{
		System.out.println("Go right");
	}
}
