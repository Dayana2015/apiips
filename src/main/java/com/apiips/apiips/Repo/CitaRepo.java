package com.apiips.apiips.Repo;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.javaback.javaback.entity.Cita;

@RepositoryRestResource(collectionResourceRel = "citas" , path = "citas")
@CrossOrigin(origins = "http://localhost:3000")
public interface CitaRepo extends CrudRepository<CitaRepo, Long> {
    
}