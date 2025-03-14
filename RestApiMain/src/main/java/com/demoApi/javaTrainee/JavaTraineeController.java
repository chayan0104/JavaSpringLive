package com.demoApi.javaTrainee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("trainee/api/v1")
public class JavaTraineeController {
	
	@Autowired
	private JavaTraineeService service;

	@PostMapping("/register")
	public String registerTrainee(@RequestBody JavaTraineeDTO dto) {
		return service.registerTrainee(dto);
	}
	@PostMapping("/registerall")
	public String registerAllTrainee() {
		return null;
	}
	@PutMapping("/update")
	public String updateTrainee() {
		return null;
	}
	@DeleteMapping("/delete")
	public String deleteTrainee() {
		return null;
	}
	@GetMapping("/find")
	public String findTrainee() {
		return null;
	}
	@GetMapping("/findall")
	public String findAllTrainee() {
		return null;
	}

}
