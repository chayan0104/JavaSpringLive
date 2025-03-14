package com.demoApi.javaTrainee;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface JavaTraineeService {
	
	public String registerTrainee(JavaTraineeDTO dto);
	public String registerAllTrainee(List<JavaTraineeDTO> dtolist);
	public JavaTraineeDTO updateTrainee(JavaTraineeDTO dto,Integer id);
	public String deleteTrainee(Integer id);	
	public String findByIDTrainee(Integer id);
	public List<JavaTraineeDTO> findallTrainee();	

}
