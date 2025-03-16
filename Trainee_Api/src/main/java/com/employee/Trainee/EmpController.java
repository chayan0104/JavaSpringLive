package com.employee.Trainee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmpController {
	@Autowired
	private EmpServiceImpl empService;

	@PostMapping("/register")
	public ResponseEntity<String> createEmployee(@RequestBody EmpDto empDto) {
		empService.createEmployee(empDto);
        return new ResponseEntity<>("Registered",HttpStatus.CREATED);
	}

	@PostMapping("/registerall")
	public ResponseEntity<String> createMultipleEmployees(@RequestBody List<EmpDto> empDtos) {
		empService.createMultipleEmployees(empDtos);
		return new ResponseEntity<>("Registered all",HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public String updateEmployee(@RequestParam String param) {
		return null;
	}

	@DeleteMapping("/delete")
	public String deleteEmployee(@RequestParam String param) {
		return null;
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<EmpDto> getEmployeeById(@PathVariable Integer id) {
		EmpDto empDto = empService.getEmployeeById(id);		
		return ResponseEntity.ok(empDto);
	}

	@GetMapping("/findall")
	public String getAllEmployees(@RequestParam String param) {
		return null;
	}

}
