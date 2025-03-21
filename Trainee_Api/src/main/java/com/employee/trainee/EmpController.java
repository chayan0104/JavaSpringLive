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

    private final EmpServiceImpl empService;
    private final EmpRepo empRepo;

    public EmpController(EmpServiceImpl empService, EmpRepo empRepo) {
        this.empService = empService;
        this.empRepo = empRepo;
    }

    @PostMapping("/register")
    public ResponseEntity<String> createEmployee(@RequestBody EmpDto empDto) {
        empService.createEmployee(empDto);
        return new ResponseEntity<>("Employee Registered", HttpStatus.CREATED);
    }

    @PostMapping("/registerall")
    public ResponseEntity<String> createMultipleEmployees(@RequestBody List<EmpDto> empDtos) {
        empService.createMultipleEmployees(empDtos);
        return new ResponseEntity<>("All Employees Registered", HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable Integer id, @RequestBody EmpDto empDto) {
        if (empRepo.existsById(id)) {
            empService.updateEmployee(empDto, id);
            return ResponseEntity.ok("Employee Updated");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("Employee with ID " + id + " not found. Please provide a valid ID.");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {
        if (empRepo.existsById(id)) {
            empService.deleteEmployee(id);
            return ResponseEntity.ok("Employee Deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("Employee with ID " + id + " not found. Please provide a valid ID.");
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Integer id) {
        if (empRepo.existsById(id)) {
            EmpDto empDto = empService.getEmployeeById(id);
            return ResponseEntity.ok(empDto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("Employee with ID " + id + " not found. Please provide a valid ID.");
        }
    }

    @GetMapping("/findall")
    public ResponseEntity<?> getAllEmployees(@RequestParam(required = false) String param) {
        List<EmpDto> emplist = empService.getAllEmployees();
        if (emplist.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No employees found");
        } else {
            // Returning the list directly rather than a concatenated string.
            return ResponseEntity.ok(emplist);
        }
    }
}
