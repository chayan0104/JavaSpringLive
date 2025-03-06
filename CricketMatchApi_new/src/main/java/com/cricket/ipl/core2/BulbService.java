package com.cricket.ipl.core2;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Service
//@NoArgsConstructor
//@AllArgsConstructor
public class BulbService {

	@Autowired
	private Bulb bulb;
	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbctemplate;


	public String askBulb() {
		return bulb.getBulb();
	}

	public String dbConnection() {
		try {
			if (dataSource != null) {
				dataSource.getConnection();
				System.out.println("DB connected");
				return "Database Connection Successful!";
			} else {
				return "DataSource is not initialized!";
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return "Database Connection Failed!";
		}
	}

	public String jdbcConnection() {
		try {
			if (jdbctemplate != null && jdbctemplate.getDataSource() != null) {
				jdbctemplate.getDataSource().getConnection();
				System.out.println("Jdbc connected");
				return "Jdbc Connection Successful!";
			} else {
				return "JdbcTemplate or DataSource is not initialized!";
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return "Jdbc Connection Failed!";
		}
	}
}
