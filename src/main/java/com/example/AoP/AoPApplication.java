package com.example.AoP;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class AoPApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(AoPApplication.class,Business.class,Aspects.class, AppConfig.class);
		context.refresh();
		Business obj=context.getBean(Business.class);
		obj.show();
	}

}
