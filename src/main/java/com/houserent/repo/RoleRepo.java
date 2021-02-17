package com.houserent.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.houserent.model.RoleDao;
@Repository
public interface RoleRepo extends CrudRepository<RoleDao, Integer>{

}
