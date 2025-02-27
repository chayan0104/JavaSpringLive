package com.cricket.ipl.core2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class LGBulb implements Bulb {

	@Autowired
	private Light light1;

	@Override
	public String getBulb() {
		return "Lgbulb: " + light1.lgLight();
	}
}
