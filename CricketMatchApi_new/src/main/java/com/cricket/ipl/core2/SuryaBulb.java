package com.cricket.ipl.core2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "Surya") //manually naming the bean
//@Qualifier("Surya")
@Scope("prototype") //multiple object can be created using prototype Scope 
@Primary  //making it main bean 
public class SuryaBulb implements Bulb {

	@Autowired
	private Light light2;

	@Override
	public String getBulb() {
		return "Surya bulb: " + light2.suryaLight();
	}

}