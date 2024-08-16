package com.learningSpring.learnspringBoot;

import org.springframework.beans.factory.annotation.Autowired;

import com.learningSpring.learnspringBoot.game.GamingConsole;
import com.learningSpring.learnspringBoot.game.Mario;

public class GameMario {

	@Autowired
	private Mario gamer;//dependency and instance of mario

	public GameMario(Mario gamer) {
		this.gamer = gamer;
	}

	public void run() {
		
		gamer.down();
		gamer.left();
		gamer.up();
		gamer.right();

	
}
}
