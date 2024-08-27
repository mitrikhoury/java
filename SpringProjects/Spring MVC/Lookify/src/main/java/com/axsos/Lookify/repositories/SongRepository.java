package com.axsos.Lookify.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.axsos.Lookify.models.Song;


public interface SongRepository extends JpaRepository<Song, Long>{
	List<Song> findByArtistContaining(String artist);
    List<Song> findTop10ByOrderByRatingDesc();

}