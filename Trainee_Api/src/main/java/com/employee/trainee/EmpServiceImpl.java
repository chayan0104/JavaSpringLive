package com.employee.trainee;

import java.util.ArrayList;
import java.util.List;

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

		return null;
	}

	@Override
	public String deleteEmployee(Integer id) {
		empRepo.deleteById(id);
		return "Employee Deleted";
	}

	@Override
	public EmpDto getEmployeeById(Integer id) {

		return null;
	}

	@Override
	public List<EmpDto> getAllEmployees() {

		return null;
	}

}
