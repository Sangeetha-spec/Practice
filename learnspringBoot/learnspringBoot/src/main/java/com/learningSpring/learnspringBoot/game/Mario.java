package com.learningSpring.learnspringBoot.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//spring creates an instance of this component
@Component

public class Mario  implements GamingConsole {
	
	public void up()
	{
		System.out.println("upside");
	}
    public void right()
    {
    	System.out.println("rightside");
    }
	public void left()
	{
		System.out.println("leftside");
	}
	public void down()
	{
		System.out.println("downside");
	}
	@Override
	public void upe() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void downe() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void righte() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lefte() {
		// TODO Auto-generated method stub
		
	}
	
	
}
