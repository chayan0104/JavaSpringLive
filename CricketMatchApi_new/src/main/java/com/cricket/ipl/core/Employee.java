package com.cricket.ipl.core;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {

    private int id;
    private String name;
    private Address address;  
   
}
