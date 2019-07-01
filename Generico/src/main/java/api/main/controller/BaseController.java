package api.main.controller;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import api.main.service.IBaseService;

public abstract class BaseController <DTO>{

	private IBaseService service;
	
	public BaseController(IBaseService service) {
		this.service = service;
	}
	
	@GetMapping("/")
	@CrossOrigin(origins = "*")
	@Transactional
	public ResponseEntity getAll(){
		
		try {
			
			return ResponseEntity.status(HttpStatus.FOUND).body(service.findAll());
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"message\": \"Error. Please try again later.\"}");
			
		}
		
	}
	
	@GetMapping("/{id}")
	@CrossOrigin(origins = "*")
	@Transactional
	public ResponseEntity getOne(@PathVariable int id) {
		
		try {
			
			return ResponseEntity.status(HttpStatus.FOUND).body(service.findById(id));
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\": \"Error. Please check the ID, and try again later.\"}");
			
		}
		
	}
	
	
	@PostMapping("/")
	@CrossOrigin(origins = "*")
	public ResponseEntity post(@RequestBody DTO dto) {
		
		try {
			
			DTO result = (DTO) service.save(dto);
			return ResponseEntity.status(HttpStatus.FOUND).body(result);
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\": \"Error. Please check the BODY request, and try again later.\"}");
						
		}
		
	}
	
	@PutMapping("/{id}")
	@CrossOrigin(origins = "*")
	@Transactional
	public ResponseEntity put(@PathVariable int id, @RequestBody DTO dto) {
		
		try {
			
			DTO result = (DTO) service.update(id, dto);
			return ResponseEntity.status(HttpStatus.FOUND).body(result);
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\": \"Error. Please check the ID or BODY request, and try again later.\"}");
						
		}
		
	}
	
	@DeleteMapping("/{id}")
	@CrossOrigin(origins = "*")
	@Transactional
	public ResponseEntity delete(@PathVariable int id) {
		
		try {
			
			service.delete(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\": \"Error. Please check the ID or BODY request, and try again later.\"}");
						
		}
		
	}
	
}
