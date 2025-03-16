package com.employee.Trainee;

import java.util.List;

public interface EmpService {

	public String createEmployee(EmpDto empDto);

	public String createMultipleEmployees(List<EmpDto> empDtos);

	public EmpDto updateEmployee(EmpDto empDto, Integer id);

	public void deleteEmployee(Integer id);

	public EmpDto getEmployeeById(Integer id);

	public List<EmpDto> getAllEmployees();
}
