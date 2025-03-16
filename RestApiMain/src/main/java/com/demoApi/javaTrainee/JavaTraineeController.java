package com.demoApi.javaTrainee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainee/api/v1")
public class JavaTraineeController {

    @Autowired
    private JavaTraineeService service;

    // Register a single trainee
    @PostMapping("/register")
    public ResponseEntity<String> registerTrainee(@RequestBody JavaTraineeDTO dto) {
        return service.registerTrainee(dto);
    }

    // Register multiple trainees
    @PostMapping("/registerall")
    public ResponseEntity<String> registerAllTrainee(@RequestBody List<JavaTraineeDTO> dto) {
        return service.registerAllTrainee(dto);
    }

    // Update a trainee by ID
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateTrainee(@RequestBody JavaTraineeDTO dto, @PathVariable Integer id) {
        return service.updateTrainee(dto, id);
    }

    // Delete a trainee by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTrainee(@PathVariable Integer id) {
        return service.deleteTrainee(id);
    }

    // Find a trainee by ID
    @GetMapping("/find/{id}")
    public ResponseEntity<JavaTraineeDTO> findTrainee(@PathVariable Integer id) {
        JavaTraineeDTO trainee = service.findByIDTrainee(id);
        return trainee != null ? ResponseEntity.ok(trainee) : ResponseEntity.notFound().build();
    }

    // Find all trainees
    @GetMapping("/findall")
    public ResponseEntity<List<JavaTraineeDTO>> findAllTrainee() {
        List<JavaTraineeDTO> trainees = service.findallTrainee();
        return trainees.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(trainees);
    }
}
