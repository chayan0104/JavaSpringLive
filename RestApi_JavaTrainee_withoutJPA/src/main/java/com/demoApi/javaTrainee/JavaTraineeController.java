package com.demoApi.javaTrainee;

import org.springframework.beans.factory.annotation.Autowired; // Import for automatic dependency injection
import org.springframework.http.ResponseEntity; // Import for HTTP response handling
import org.springframework.web.bind.annotation.*; // Import for various RESTful annotations

import java.util.List;

@RestController // Marks this class as a Spring Web REST controller to handle HTTP requests
@RequestMapping("/trainee/api/v1") // Base URL for the API (all endpoints in this controller will start with "/trainee/api/v1")
public class JavaTraineeController {

    @Autowired // Automatically injects the JavaTraineeService into the controller
    private JavaTraineeService service;

    // Register a single trainee
    @PostMapping("/register") 
    public ResponseEntity<String> registerTrainee(@RequestBody JavaTraineeDTO dto) {
        // Calls the service method to register a single trainee
        return service.registerTrainee(dto);
    }

    // Register multiple trainees
    @PostMapping("/registerall") 
    public ResponseEntity<String> registerAllTrainee(@RequestBody List<JavaTraineeDTO> dto) {
        // Calls the service method to register multiple trainees
        return service.registerAllTrainee(dto);
    }

    // Update a trainee by ID
    @PutMapping("/update/{id}") 
    public ResponseEntity<String> updateTrainee(@RequestBody JavaTraineeDTO dto, @PathVariable Integer id) {
        // Calls the service method to update the trainee information based on the ID
        return service.updateTrainee(dto, id);
    }

    // Delete a trainee by ID
    @DeleteMapping("/delete/{id}") 
    public ResponseEntity<String> deleteTrainee(@PathVariable Integer id) {
        // Calls the service method to delete a trainee by ID
        return service.deleteTrainee(id);
    }

    // Find a trainee by ID
    @GetMapping("/find/{id}") 
    public ResponseEntity<JavaTraineeDTO> findTrainee(@PathVariable Integer id) {
        // Calls the service method to find a trainee by ID
        JavaTraineeDTO trainee = service.findByIDTrainee(id);
        // If the trainee is found, return it with a 200 OK status. Otherwise, return 404 Not Found.
        return trainee != null ? ResponseEntity.ok(trainee) : ResponseEntity.notFound().build();
    }

    // Find all trainees
    @GetMapping("/findall") 
    public ResponseEntity<List<JavaTraineeDTO>> findAllTrainee() {
        // Calls the service method to get a list of all trainees
        List<JavaTraineeDTO> trainees = service.findallTrainee();
        // If the list is empty, return a 204 No Content status. Otherwise, return the list with 200 OK status.
        return trainees.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(trainees);
    }
}
