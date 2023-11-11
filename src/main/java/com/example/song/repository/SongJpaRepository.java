package com.example.song.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.song.model.Song;

@Repository
public interface SongJpaRepository extends JpaRepository<Song, Integer> {
    // You can add custom queries if needed
}
