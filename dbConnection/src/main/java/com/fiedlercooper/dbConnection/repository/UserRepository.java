package com.fiedlercooper.dbConnection.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.fiedlercooper.dbConnection.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{
	
	List<UserEntity> findByName(String name);
	
}
