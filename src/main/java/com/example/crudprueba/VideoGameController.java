package com.example.crudprueba;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/videogames")
public class VideoGameController {

    @Autowired
    private VideoGameService videoGameService;

    // GET all
    @GetMapping
    public List<VideoGame> getAll() {
        return videoGameService.getAllGames();
    }

    // GET by ID
    @GetMapping("/{id}")
    public Optional<VideoGame> getById(@PathVariable("id") Long id) {
        return videoGameService.getGameById(id);
    }

    // POST (Create)
    @PostMapping
    public VideoGame save(@RequestBody VideoGame game) {
        return videoGameService.saveOrUpdate(game);
    }

    // PUT (Update)
    @PutMapping("/{id}")
    public VideoGame update(@PathVariable("id") Long id, @RequestBody VideoGame game) {
        game.setId(id); // asegura que se actualiza el existente
        return videoGameService.saveOrUpdate(game);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        videoGameService.deleteGame(id);
    }
}
