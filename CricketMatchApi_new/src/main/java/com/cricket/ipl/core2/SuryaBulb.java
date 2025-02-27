package com.cricket.ipl.core2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class SuryaBulb implements Bulb {

	@Override
	public String getBulb() {
		// TODO Auto-generated method stub
		return "Surya";
	}

}
