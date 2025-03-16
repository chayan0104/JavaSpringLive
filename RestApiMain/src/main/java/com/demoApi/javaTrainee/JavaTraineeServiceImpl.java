package com.demoApi.javaTrainee;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class JavaTraineeServiceImpl implements JavaTraineeService {

    private JavaTraineeRepo javaTraineeRepo;

    private ObjectMapper mapper;
   
    private JavaTraineeServiceImpl(JavaTraineeRepo javaTraineeRepo, ObjectMapper mapper) {
		super();
		this.javaTraineeRepo = javaTraineeRepo;
		this.mapper = mapper;
	}

	@Override
    public ResponseEntity<String> registerTrainee(JavaTraineeDTO dto) {
        JavaTraineeEntity entity = mapper.convertValue(dto, JavaTraineeEntity.class);
        javaTraineeRepo.save(entity);
        return ResponseEntity.status(201).body("Trainee Info saved");
    }

    @Override
    public ResponseEntity<String> registerAllTrainee(List<JavaTraineeDTO> dtolist) {
        List<JavaTraineeEntity> entities = mapper.convertValue(dtolist, List.class);
        javaTraineeRepo.saveAll(entities);
        return ResponseEntity.status(201).body("All trainees saved");
    }

    @Override
    public ResponseEntity<String> updateTrainee(JavaTraineeDTO dto, Integer id) {
        Optional<JavaTraineeEntity> existing = javaTraineeRepo.findById(id);
        if (!existing.isPresent()) {
            return ResponseEntity.status(404).body("Trainee not found");
        }
        
        JavaTraineeEntity entity = mapper.convertValue(dto, JavaTraineeEntity.class);
        entity.setId(id);
        javaTraineeRepo.save(entity);
        return ResponseEntity.status(200).body("Trainee updated");
    }

    @Override
    public ResponseEntity<String> deleteTrainee(Integer id) {
        if (!javaTraineeRepo.existsById(id)) {
            return ResponseEntity.status(404).body("Trainee not found");
        }
        javaTraineeRepo.deleteById(id);
        return ResponseEntity.status(200).body("Trainee deleted");
    }

    @Override
    public JavaTraineeDTO findByIDTrainee(Integer id) {
        Optional<JavaTraineeEntity> entity = javaTraineeRepo.findById(id);
        return entity.map(e -> mapper.convertValue(e, JavaTraineeDTO.class)).orElse(null);
    }

    @Override
    public List<JavaTraineeDTO> findallTrainee() {
        return mapper.convertValue(javaTraineeRepo.findAll(), List.class);
    }
}
