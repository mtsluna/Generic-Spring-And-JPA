package api.main.service;

import java.util.List;
import javax.transaction.Transactional;

public interface IBaseService <DTO>{

	public List<DTO> findAll() throws Exception;
	
	public DTO findById(int id) throws Exception;
	
	public DTO save (DTO dto) throws Exception;
	
	public DTO update (int id, DTO dto) throws Exception;
	
	public boolean delete(int id) throws Exception;
}
