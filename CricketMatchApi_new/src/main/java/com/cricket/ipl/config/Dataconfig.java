//package com.cricket.ipl.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//@Configuration
//@EnableAutoConfiguration
//public class Dataconfig {
//
//    // with DataSourceBuilder for MySQL
//    @Bean
//    @Primary
//    DataSource mysqlDataSource() {
//        return DataSourceBuilder.create()
//                .driverClassName("com.mysql.cj.jdbc.Driver")
//                .url("jdbc:mysql://localhost:3306/mydb")
//                .username("root")
//                .password("1234242")
//                .build();
//    }
//
//    // With DriverManagerDataSource for Oracle
//    @Bean
//    DataSource datasource() {
//        DriverManagerDataSource dSource = new DriverManagerDataSource();
//        dSource.setDriverClassName("oracle.jdbc.OracleDriver");
//        dSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
//        dSource.setUsername("MYSQL80");
//        dSource.setPassword("1234242");
//
//        return dSource;
//    }
//}
