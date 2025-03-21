package com.employee.trainee;

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

	private EmpServiceImpl empService;
	private EmpRepo empRepo;
	private EmpDto empDto;

	@Autowired
	public void setEmpService(EmpServiceImpl empService) {
		this.empService = empService;
	}

	@Autowired
	public void setEmpRepo(EmpRepo empRepo) {
		this.empRepo = empRepo;
	}

	@Autowired
	public void setEmpDto(EmpDto empDto) {
		this.empDto = empDto;
	}

	@PostMapping("/register")
	public ResponseEntity<String> createEmployee(@RequestBody EmpDto empDto) {
		empService.createEmployee(empDto);
		return new ResponseEntity<>("Registered", HttpStatus.CREATED);
	}

	@PostMapping("/registerall")
	public ResponseEntity<String> createMultipleEmployees(@RequestBody List<EmpDto> empDtos) {
		empService.createMultipleEmployees(empDtos);
		return new ResponseEntity<>("Registered all", HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody EmpDto empDto, Integer id) {
		if (empRepo.existsById(id)) {
			empService.updateEmployee(empDto, id);
			return ResponseEntity.ok("Employee Updated");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Enter a valid data");
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {
		if (empRepo.existsById(id)) {
			empService.deleteEmployee(id);
			return ResponseEntity.ok("Deleted");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(id + "Is not found;please enter a valid id:");
		}

	}

	@GetMapping("/find/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable Integer id) {
		if (empRepo.existsById(id)) {
			empDto = empService.getEmployeeById(id);
			return ResponseEntity.ok(empDto);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(id + "Is not found;please enter a valid id");
		}
	}

	@GetMapping("/findall")
	public ResponseEntity<?>  getAllEmployees(@RequestParam(required = false) String param) {
		List<EmpDto> emplist = empService.getAllEmployees();
		
		if (emplist.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no emplyee found");
		} else {
			return ResponseEntity.ok("Emplyees list ");
			
		}
	}

}
