package com.demoApi.javaTrainee;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class JavaTraineeServiceImpl implements JavaTraineeService {

    private JavaTraineeRepo javaTraineeRepo; // Repository for database interactions
    private ObjectMapper mapper; // ObjectMapper to map between DTO and Entity objects

    // Constructor to inject dependencies (JavaTraineeRepo and ObjectMapper)
    private JavaTraineeServiceImpl(JavaTraineeRepo javaTraineeRepo, ObjectMapper mapper) {
        super();
        this.javaTraineeRepo = javaTraineeRepo;
        this.mapper = mapper;
    }

    // Register a single trainee
    @Override
    public ResponseEntity<String> registerTrainee(JavaTraineeDTO dto) {
        // Convert DTO to Entity for saving to the database
        JavaTraineeEntity entity = mapper.convertValue(dto, JavaTraineeEntity.class);
        
        // Save the entity to the repository (database)
        javaTraineeRepo.save(entity);
        
        // Return success response with status code 201 (Created)
        return ResponseEntity.status(201).body("Trainee Info saved");
    }

    // Register multiple trainees
    @Override
    public ResponseEntity<String> registerAllTrainee(List<JavaTraineeDTO> dtolist) {
        // Convert the list of DTOs to a list of entities
        List<JavaTraineeEntity> entities = mapper.convertValue(dtolist, List.class);
        
        // Save all entities to the repository (database)
        javaTraineeRepo.saveAll(entities);
        
        // Return success response with status code 201 (Created)
        return ResponseEntity.status(201).body("All trainees saved");
    }

    // Update a trainee by ID
    @Override
    public ResponseEntity<String> updateTrainee(JavaTraineeDTO dto, Integer id) {
        // Check if the trainee exists by ID
        Optional<JavaTraineeEntity> existing = javaTraineeRepo.findById(id);
        if (!existing.isPresent()) {
            // If the trainee doesn't exist, return a 404 (Not Found) response
            return ResponseEntity.status(404).body("Trainee not found");
        }
        
        // Convert the updated DTO to an entity
        JavaTraineeEntity entity = mapper.convertValue(dto, JavaTraineeEntity.class);
        entity.setId(id); // Set the ID to ensure the existing entity is updated
        
        // Save the updated entity to the repository (database)
        javaTraineeRepo.save(entity);
        
        // Return success response with status code 200 (OK)
        return ResponseEntity.status(200).body("Trainee updated");
    }

    // Delete a trainee by ID
    @Override
    public ResponseEntity<String> deleteTrainee(Integer id) {
        // Check if the trainee exists by ID
        if (!javaTraineeRepo.existsById(id)) {
            // If the trainee doesn't exist, return a 404 (Not Found) response
            return ResponseEntity.status(404).body("Trainee not found");
        }
        
        // Delete the trainee by ID from the repository (database)
        javaTraineeRepo.deleteById(id);
        
        // Return success response with status code 200 (OK)
        return ResponseEntity.status(200).body("Trainee deleted");
    }

    // Find a trainee by ID
    @Override
    public JavaTraineeDTO findByIDTrainee(Integer id) {
        // Find the trainee by ID in the repository (database)
        Optional<JavaTraineeEntity> entity = javaTraineeRepo.findById(id);
        
        // If the trainee exists, convert the entity to a DTO and return it, else return null
        return entity.map(e -> mapper.convertValue(e, JavaTraineeDTO.class)).orElse(null);
    }

    // Find all trainees
    @Override
    public List<JavaTraineeDTO> findallTrainee() {
        // Convert the list of trainee entities to a list of DTOs
        return mapper.convertValue(javaTraineeRepo.findAll(), List.class);
    }
}
