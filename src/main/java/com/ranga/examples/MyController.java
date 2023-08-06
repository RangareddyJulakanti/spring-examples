package com.ranga.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;
//View,UI @Controller,@RestController 2.Business Logic @Service,@Component 3.Dao/Repo layer //@Repository


//@Inject @Named

//@Controller
public class MyController {
	@Autowired
	private List<MyService> myServices;


	public void m1(){
		myServices.get(0).m2();
	}
	
}