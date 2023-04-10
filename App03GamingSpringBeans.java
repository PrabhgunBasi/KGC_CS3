package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;
import com.in28minutes.*;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		
		context.getBean(GamingConsole.class).up();

		
	}
  
}