package org.celebino.persistence.dao;

import org.celebino.persistence.model.GardenStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGardenStatusDao extends CrudRepository<GardenStatus, Long> {
	
	public GardenStatus findById(Long id);

}
