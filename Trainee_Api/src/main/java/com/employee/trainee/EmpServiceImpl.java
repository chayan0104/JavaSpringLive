package com.employee.trainee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmpServiceImpl implements EmpService {
	private EmpRepo empRepo;

	private final ObjectMapper mapper;

	public EmpServiceImpl(ObjectMapper mapper, EmpRepo empRepo) {
		this.mapper = mapper;
		this.empRepo = empRepo;
	}

	@Override
	public String createEmployee(EmpDto empDto) {
		EmpEntity savedEntity = mapper.convertValue(empDto, EmpEntity.class);
		empRepo.save(savedEntity);
		return "Registered";
	}

	@Override
	public String createMultipleEmployees(List<EmpDto> empDtos) {
		List<EmpEntity> entities = new ArrayList<>();
		for (EmpDto empDto : empDtos) {
			EmpEntity entity = mapper.convertValue(empDto, EmpEntity.class);
			entities.add(entity);
		}
		empRepo.saveAll(entities);
		return "Successfully registered " + entities.size() + " employees.";
	}

	@Override
	public EmpDto updateEmployee(EmpDto empDto, Integer id) {
		EmpEntity entity = mapper.convertValue(empDto, EmpEntity.class);
		entity.setId(id);
		empRepo.save(entity);
		return null;
	}

	@Override
	public String deleteEmployee(Integer id) {
		empRepo.deleteById(id);
		return "Employee deleted";
	}

	@Override
	public EmpDto getEmployeeById(Integer id) {
		Optional<EmpEntity> existingEntity = empRepo.findById(id);
		return mapper.convertValue(existingEntity.get(), EmpDto.class);
	}

	@Override
	public List getAllEmployees() {
		
		List<EmpEntity> entities = empRepo.findAll();
        List<EmpDto> dtoList = new ArrayList<>();
        for (EmpEntity entity : entities) {
            dtoList.add(mapper.convertValue(entity, EmpDto.class));  // Convert each entity to DTO
        }
        return dtoList;
	}

}
