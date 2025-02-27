package com.cricket.ipl.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // This annotation from Lombok generates getters, setters, toString(), equals(), and hashCode() methods automatically.
@AllArgsConstructor // creates a constructor that takes arguments for all fields
@NoArgsConstructor  //generates a no-argument constructor for the class.
public class UserEntity {
	private int id;
    private String name;
    
//	public User(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
    
    
    
    
}
