package com.shunya.languages.sevices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shunya.languages.models.Language;
import com.shunya.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	// Can be replaced with below Code:
	// @Autowired
	//private LanguageRespository lRepo;
	
	private LanguageRepository lRepo;
	public LanguageService(LanguageRepository lRepo) {
		this.lRepo = lRepo;
	}
	//Display All Languages
	public List<Language> allLanguage(){
		return this.lRepo.findAll();
	}
	
	
	//Create
	public Language createLanguage(Language language) {
		return this.lRepo.save(language);
	}
	//Read
	public Language getOneLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	//Update
	public Language updatedLanguage(Long id, Language language) {
		return this.lRepo.save(language);
	}
	
	//Delete
	public String deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
		return "Language " + id + " has been deleted. ";
	}
	
}
