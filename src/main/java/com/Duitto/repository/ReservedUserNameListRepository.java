package com.Duitto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Duitto.model.ReservedUsernameListModel;

public interface ReservedUserNameListRepository extends CrudRepository<ReservedUsernameListModel, Long> {

	@Query("from ReservedUsernameListModel where reservedUserName = ?1 and isAvailable=0")
	Optional<ReservedUsernameListModel> findbyUserName(String uname);

}
