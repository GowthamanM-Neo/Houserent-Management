package com.houserent.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.houserent.model.UserDao;

@Repository
public interface UserRepo extends CrudRepository<UserDao, Integer>{

	Optional<UserDao> findByEmail(String username);

}
