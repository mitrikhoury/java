package com.axsos.Lookify.Services;

import org.springframework.stereotype.Service;

import com.axsos.Lookify.models.Song;
import com.axsos.Lookify.repositories.SongRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    
    public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}

	public List<Song> allSongs() {
        return songRepository.findAll();
    }

    public Song createSong(Song s) {
        return songRepository.save(s);
    }

    public Song findSong(Long id) {
        Optional<Song> optionalSong = songRepository.findById(id);
        return optionalSong.orElse(null);
    }

    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }

    public List<Song> searchSongs(String artist) {
        return songRepository.findByArtistContaining(artist);
    }

    public List<Song> topTenSongs() {
        return songRepository.findTop10ByOrderByRatingDesc();
    }
}