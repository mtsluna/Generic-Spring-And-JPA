package api.main.service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.description.type.TypeVariableToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import api.main.DTO.BaseDTO;
import api.main.entity.Base;

public class BaseService <ENTITY, DTO>{
			
	private JpaRepository repository;
	private Class dtoClass;
	private Class entityClass;
	
	public BaseService(JpaRepository repository, Class dtoClass, Class entityClass) {
		this.repository = repository;
		this.dtoClass = dtoClass;
		this.entityClass = entityClass;
	}
	
	public List<DTO> findAll() throws Exception {
		
		List<ENTITY> entities = repository.findAll();
		List<DTO> dtos = new ArrayList<>();
		
		try {
		
			ModelMapper modelMapper = new ModelMapper();
			
			for (ENTITY item : entities) {
				
				DTO dto = (DTO) modelMapper.map(item, dtoClass);
				dtos.add(dto);
				
			}
		
		} catch (Exception e) {
			
			throw new Exception();
			
		}
		
		return dtos;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
