package com.learningSpring.learnspringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learningSpring.learnspringBoot.enterprise.services.webdata;
import com.learningSpring.learnspringBoot.game.GameRunner;
import com.learningSpring.learnspringBoot.game.GamingConsole;
import com.learningSpring.learnspringBoot.game.Mario;
import com.learningSpring.learnspringBoot.game.superContract;

@SpringBootApplication
public class LearnspringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnspringBootApplication.class, args);
		
		//GameRunner runner = context.getBean(GameRunner.class);
		//runner.run();//primary annotation class result will appear
		
		//GamingConsole console = new Mario();
		//GameRunner runner = new GameRunner(console);
		//runner.run();//only mario class resultwill appear
		
		/*
		 * Mario m= new Mario(); GameRunner run = new GameRunner(m); run.run();
		 * superContract s= new superContract(); GameRunner run1 = new GameRunner(s);
		 * run1.run();
		 */// both mario and supercontractwill appear 
	}

}



//GameRunner runner = context.getBean(GameRunner.class);

		//context will manage all the beans(component , autowired beans)
		//Mario game = new Mario();
		//superContract game = new superContract();
		//superContract game= new superContract();
		//GamingConsole games= new Mario();
		//GamingConsole games1= new superContract();
		//Mario gamer= new Mario();
		
		//GameRunner runner = new GameRunner(game);
		//GameRunner run = new GameRunner(games);
		//GameRunner runner1 = new GameRunner(games1);

		//runner.run();
	//runner1.run();
	//run.run();
		//myWebController bean = context.getBean(myWebController.class);
		//bean.returnValueFromWebController();
		//System.out.println(bean.returnValueFromWebController());

		//webdata bean = context.getBean(webdata.class);
		//bean.returnWebLayer();
		//System.out.println(bean.returnWebLayer());