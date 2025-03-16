package com.demoApi.javaTrainee;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface JavaTraineeRepo {
    // Save a trainee
    void save(JavaTraineeEntity trainee);
    
    // Save multiple trainees
    void saveAll(List<JavaTraineeEntity> trainees);
    
    // Find a trainee by ID
    JavaTraineeEntity findById(int id);
    
    // Find all trainees
    List<JavaTraineeEntity> findAll();
    
    // Update a trainee
    void update(JavaTraineeEntity trainee);
    
    // Delete a trainee by ID
    void deleteById(int id);
    
    // Check if a trainee exists by ID
    boolean existsById(int id);
}
