package com.employee.trainee;

import java.util.List;

public interface EmpService {

	public String createEmployee(EmpDto empDto);

	public String createMultipleEmployees(List<EmpDto> empDtos);

	public EmpDto updateEmployee(EmpDto empDto, Integer id);

	public String deleteEmployee(Integer id);

	public EmpDto getEmployeeById(Integer id);

	public List getAllEmployees();
}
