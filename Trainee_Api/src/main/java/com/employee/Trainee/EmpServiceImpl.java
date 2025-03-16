package com.employee.Trainee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpRepo empRepo;

	private final ObjectMapper mapper;

	public EmpServiceImpl(ObjectMapper mapper) {
		this.mapper = mapper; // Initialize ObjectMapper through constructor injection
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public EmpDto getEmployeeById(Integer id) {
		EmpEntity empEntity = empRepo.getById(id);
	    EmpDto empDto = mapper.convertValue(empEntity, EmpDto.class);  // assuming mapper is a ModelMapper or ObjectMapper
	    return empDto;
	}

	@Override
	public List<EmpDto> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
