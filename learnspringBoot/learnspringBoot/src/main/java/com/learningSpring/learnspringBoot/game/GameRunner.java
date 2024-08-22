package com.learningSpring.learnspringBoot.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	
	private GamingConsole gaming;//dependency and instance of mario

	
	public GameRunner(GamingConsole gaming) {
		super();
		System.out.println("constructor injection");
		this.gaming = gaming;
		
		
	}
   
	public void setGaming(GamingConsole gaming) {
    	System.out.println("setter");
		this.gaming = gaming;
	}


	public void run() {
		
		gaming.down();
		gaming.left();
		gaming.up();
		gaming.right();
gaming.lefte();
gaming.righte();
gaming.upe();
gaming.downe();
	
}


}

