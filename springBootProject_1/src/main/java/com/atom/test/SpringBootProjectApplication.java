package com.atom.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
	    ConfigurableApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);
//	    Alien a = context.getBean(Alien.class);
//	    a.show(); //removing after adding @Component for Alien.java
	    
	    Alien a = context.getBean(Alien.class);
	    a.show();
//	    Alien b = context.getBean(Alien.class);
//	    b.show(); //removed after adding 1 and 2 in Alien.java
	    
	    //above 4 lines will create single object for singleton scope i.e., @Component
	    //and creates multiple objects(2 objects) for prototype scope i.e., @Scope(value = "prototype")
	    
	}

}
