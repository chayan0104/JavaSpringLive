package com.cricket.ipl.core2;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.ipl.config.Dataconfig;

import lombok.Data;

@Data
@Service
public class BulbService {

	@Autowired
	private Bulb bulb;
	
	@Autowired
	private DataSource dataSource;

	public String askBulb() {	
		return bulb.getBulb();
	}
		
	public String dbConnection() {
		try {
			dataSource.getConnection();
	        System.out.println("db connected");
	        return "Database Connection Successful!";
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return "Database Connection Failed!";
	    }
	}

}
