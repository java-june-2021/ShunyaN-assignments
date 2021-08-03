package com.shunya.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shunya.lookify.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long>{
	List<Song> findAll();
//	List<Song> findByDesctiptionContaining (String search);
	List<Song> searchByArtist (String artist);
	List<Song> findTopTenByOrderByRatingDesc();
}
