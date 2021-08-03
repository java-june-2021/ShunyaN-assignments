package com.shunya.lookify.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shunya.lookify.models.Song;
import com.shunya.lookify.services.SongService;

@Controller
public class HomeController {
	@Autowired
	private SongService sService;
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/dashbboard")
	public String dashboard(Model viewModel) {
		viewModel.addAttribute("allSong", this.sService.allSong());
		return "dashboard.jsp";
	}
	
	@GetMapping("/new")
	public String newSong(@ModelAttribute("song")Song song) {
		return "new.jsp";
	}
	
	@PostMapping("/addSong")//takes information from the frontend to give to the backend
	public String addSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}else {
			this.sService.createSong(song);
			return "show.jsp";
		}
	}
	
	@GetMapping("/song/{id}")
	public String showSong(Model viewModel, @PathVariable("id") Long id) {
		Song thisSong = this.sService.getOneSong(id);
		viewModel.addAttribute("song", thisSong);
		return "show.jsp";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.sService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam("artist")String artist, Model viewModel) {
		viewModel.addAttribute("songs", this.sService.searchArtist(artist));
		viewModel.addAttribute("artist", artist);
		return "search.jsp";
	}
	
	@RequestMapping("/topTen")
	public String topTen(Model viewModel) {
		viewModel.addAttribute("songs", this.sService.topTenByRating());
		return "topTen.jsp";
	}
}
