package com.example.crudprueba;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoGameService {

    @Autowired
    private VideoGameRepository videoGameRepository;

    public List<VideoGame> getAllGames() {
        return videoGameRepository.findAll();
    }

    public Optional<VideoGame> getGameById(Long id) {
        return videoGameRepository.findById(id);
    }

    public VideoGame saveOrUpdate(VideoGame game) {
        return videoGameRepository.save(game);
    }

    public void deleteGame(Long id) {
        videoGameRepository.deleteById(id);
    }
}
