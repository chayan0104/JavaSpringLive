package com.demoApi.javaTrainee;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface JavaTraineeService {
	
    // Method to register a single trainee
    public ResponseEntity<String> registerTrainee(JavaTraineeDTO dto);

    // Method to register a list of trainees
    public ResponseEntity<String> registerAllTrainee(List<JavaTraineeDTO> dtolist);

    // Method to update a single trainee
    public ResponseEntity<String> updateTrainee(JavaTraineeDTO dto, Integer id);

    // Method to delete a single trainee
    public ResponseEntity<String> deleteTrainee(Integer id);	

    // Method to find a trainee by ID
    public JavaTraineeDTO findByIDTrainee(Integer id);

    // Method to find all trainees
    public List<JavaTraineeDTO> findallTrainee();	
}
