package com.demoApi.javaTrainee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// The @Repository annotation indicates that this interface is a Spring Data repository 
// which is responsible for performing CRUD operations on JavaTraineeEntity.
@Repository
public interface JavaTraineeRepo 
     extends JpaRepository<JavaTraineeEntity, Integer> {
     
     // JpaRepository provides built-in methods for CRUD operations (Create, Read, Update, Delete)
     // The generic parameters are:
     // - JavaTraineeEntity: The entity class that this repository will manage.
     // - Integer: The type of the primary key of the entity.
     //
     // You don't need to write any implementation code for common operations such as:
     // - save() - to persist an entity
     // - findById() - to retrieve an entity by its ID
     // - deleteById() - to delete an entity by its ID
     //
     // You can also define custom queries if needed, but JpaRepository already provides 
     // a lot of functionality out of the box.
}
