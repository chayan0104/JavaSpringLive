package com.demoApi.javaTrainee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JavaTraineeRepo 
     extends JpaRepository<JavaTraineeEntity,Integer>{

}
