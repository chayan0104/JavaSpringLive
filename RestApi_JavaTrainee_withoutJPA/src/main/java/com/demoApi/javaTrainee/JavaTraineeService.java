package com.demoApi.javaTrainee;

import java.util.List;

import org.springframework.http.ResponseEntity; // Import for HTTP response handling
import org.springframework.stereotype.Service; // Import for the Service annotation

@Service // Marks this interface as a Service to be managed by Spring's IoC (Inversion of Control) container
public interface JavaTraineeService {
    
    // Method to register a single trainee
    // Takes a JavaTraineeDTO object as input, which contains the trainee's details.
    // Returns a ResponseEntity containing a success or failure message.
    public ResponseEntity<String> registerTrainee(JavaTraineeDTO dto);

    // Method to register a list of trainees
    // Takes a List of JavaTraineeDTO objects, each containing the details of a trainee.
    // Returns a ResponseEntity containing a success or failure message for registering multiple trainees.
    public ResponseEntity<String> registerAllTrainee(List<JavaTraineeDTO> dtolist);

    // Method to update a single trainee's details by ID
    // Takes a JavaTraineeDTO object (new trainee data) and an Integer id (the ID of the trainee to update).
    // Returns a ResponseEntity with a success or failure message.
    public ResponseEntity<String> updateTrainee(JavaTraineeDTO dto, Integer id);

    // Method to delete a trainee by ID
    // Takes an Integer id as input (the ID of the trainee to delete).
    // Returns a ResponseEntity with a success or failure message.
    public ResponseEntity<String> deleteTrainee(Integer id);

    // Method to find a trainee by ID
    // Takes an Integer id as input (the ID of the trainee to find).
    // Returns a JavaTraineeDTO object representing the found trainee.
    // Returns null if no trainee with the given ID is found.
    public JavaTraineeDTO findByIDTrainee(Integer id);

    // Method to find all trainees
    // Returns a List of JavaTraineeDTO objects, each representing a trainee.
    public List<JavaTraineeDTO> findallTrainee();
}
