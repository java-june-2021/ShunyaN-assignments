package com.shunya.ninjas.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shunya.ninjas.Models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	

}