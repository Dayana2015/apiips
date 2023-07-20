package com.apiips.apiips.Repositorio;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.javaback.javaback.entity.Medico;

@RepositoryRestResource(collectionResourceRel = "medicos" , path = "medicos")
@CrossOrigin(origins = "http://localhost:3000")
public interface MedicoRepo extends CrudRepository<MedicoRepo, Long> {
    
}

