package com.Duitto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Duitto.model.ReserveUserNameModel;
import com.Duitto.model.ReservedUsernameListModel;

public interface ReservedUserNameListRepository extends CrudRepository<ReserveUserNameModel, Long> {

	@Query("from ReserveUserNameModel where reservedUserName = ?1 and isAvailable=0 and isRequest=0")
	Optional<ReserveUserNameModel> findbyUserName(String uname);

}
