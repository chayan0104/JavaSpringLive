package com.cricket.ipl.core2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Secondary")
public class LGBulb implements Bulb {

	@Override
	public String getBulb() {
		// TODO Auto-generated method stub
		return "LG";
	}

}


