package com.learningSpring.learnspringBoot.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class superContract implements GamingConsole {

	public void righte()
	{
		System.out.println("righter");
	}
	public void lefte()
	{
		System.out.println("lefter");
	}
	public void downe()
	{
		System.out.println("downer");
	}
	public void upe()
	{
		System.out.println("upper");
	}
	@Override
	public void right() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void left() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void down() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void up() {
		// TODO Auto-generated method stub
		
	}
	
}
