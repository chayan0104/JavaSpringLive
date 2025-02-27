package com.cricket.ipl.core2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class BulbService {

	@Autowired
	private Bulb bulb;

	public String askBulb() {
		return bulb.getBulb();

	}

}
