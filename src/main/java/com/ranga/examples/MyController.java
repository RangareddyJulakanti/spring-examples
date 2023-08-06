package com.ranga.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import javax.inject.Named;
//View,UI @Controller,@RestController 2.Business Logic @Service,@Component 3.Dao/Repo layer //@Repository


//@Inject @Named

@Controller
public class MyController {
	@Autowired
	@Qualifier("myServiceImplV1")
	private MyService myService;

	public MyController() {
		System.out.println("MyBean instance created");
		//System.out.println(myService);
	}
	public void m1(){
		myService.m2();
	}
	
}