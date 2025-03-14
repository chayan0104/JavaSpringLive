package com.demoApi.javaTrainee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class JavaTraineeServiceImpl implements JavaTraineeService {

	@Autowired
	private JavaTraineeRepo javaTraineeRepo;

	@Override
	public String registerTrainee(JavaTraineeDTO dto) {
		ObjectMapper mapper = new ObjectMapper();
		JavaTraineeEntity convertvalue = mapper.convertValue(dto, JavaTraineeEntity.class);
		javaTraineeRepo.save(convertvalue);
		return "Trainee Info saved";
	}

	@Override
	public String registerAllTrainee(List<JavaTraineeDTO> dtolist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JavaTraineeDTO updateTrainee(JavaTraineeDTO dto, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTrainee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findByIDTrainee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JavaTraineeDTO> findallTrainee() {
		// TODO Auto-generated method stub
		return null;
	}

}
