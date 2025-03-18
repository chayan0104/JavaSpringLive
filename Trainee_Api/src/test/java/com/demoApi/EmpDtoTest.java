package com.demoApi;

import org.junit.jupiter.api.Test;

import com.employee.trainee.EmpDto;

import static org.junit.jupiter.api.Assertions.*;

class EmpDtoTest {

	@Test
	void testEmpDtoGettersAndSetters() {
		EmpDto empDto = new EmpDto();
		empDto.setId(1);
		empDto.setName("John Doe");
		empDto.setEmail("john.doe@example.com");
		empDto.setCity("New York");
		empDto.setSkill("Java");
		empDto.setMobileNo(1234567890L);

		// Assertions to validate the getters and setters
		assertEquals(1, empDto.getId());
		assertEquals("John Doe", empDto.getName());
		assertEquals("john.doe@example.com", empDto.getEmail());
		assertEquals("New York", empDto.getCity());
		assertEquals("Java", empDto.getSkill());
		assertEquals(1234567890L, empDto.getMobileNo());
	}
}
