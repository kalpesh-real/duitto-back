package com.Duitto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.Duitto.model.JWTTOkenModel;

public interface JWTTokenRepository extends CrudRepository<JWTTOkenModel, Long> {

	@Query(value="SELECT *  from sh_jwt_tokens where jwt_token =?1",nativeQuery =true)
    Optional<JWTTOkenModel> findByJwtToken(String token);

	
		
	}
