package com.shunya.ninjas.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shunya.ninjas.Models.Ninja;
import com.shunya.ninjas.Repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository nRepo;
	
	public Ninja create(Ninja ninja) {
		return this.nRepo.save(ninja);
	}

}