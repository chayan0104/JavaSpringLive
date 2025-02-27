package com.cricket.ipl.core2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
//@Component
@Service
public class BulbService {

	@Autowired
	private Bulb bulb;

	@Autowired
	private Light light;

	public String askBulb() {

		return bulb.getBulb();
	}

	public String aboutLight() {

		return light.getLight();
	}

}
