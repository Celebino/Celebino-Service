package org.celebino.persistence.dao;

import org.celebino.persistence.model.ArtificialLight;
import org.celebino.persistence.model.GardenStatus;
import org.springframework.data.repository.CrudRepository;

public interface GardenStatusDao extends CrudRepository<GardenStatus, Long> {
	public GardenStatus findById(Long id);

}