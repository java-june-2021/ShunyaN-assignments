package com.shunya.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shunya.lookify.models.Song;
import com.shunya.lookify.repositories.SongRepository;

@Service
public class SongService {
	private SongRepository sRepo;
	
	public SongService(SongRepository sRepo) {
		this.sRepo = sRepo;
	}
	//display
	public List<Song> allSong(){
		return this.sRepo.findAll();
	}
	public Song createSong(Song song){
		return this.sRepo.save(song);
	}
	public Song getOneSong(Long id) {
		return this.sRepo.findById(id).orElse(null);
	}
	public Song update(Long id, Song song) {
		return this.sRepo.save(song);
	}
	public void deleteSong(Long id) {
		this.sRepo.deleteById(id);
	}
	public List<Song> searchArtist(String artist) {
		return sRepo.searchByArtist(artist);
	}
	public List<Song> topTenByRating() {
		return this.sRepo.findTopTenByOrderByRatingDesc();
	}
}
