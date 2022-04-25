package com.binaracademy.Challange4.Controller;

import com.binaracademy.Challange4.Dto.FilmDto;
import com.binaracademy.Challange4.Dto.RawJadwalFilmDto;
import com.binaracademy.Challange4.Entity.Film;
import com.binaracademy.Challange4.Service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/film")
public class FilmController {
    @Autowired
    FilmService filmService;

    @GetMapping(path = "/")
    public List<Film> view_film(){
        return  filmService.ls_film();
    }
    @GetMapping(path = "/{kd}")
    public Optional<Film> view_film(@PathVariable Long kd){
        return  filmService.ls_film(kd);
    }
    @GetMapping(path = "/raw/{kd}")
    public RawJadwalFilmDto raw_film(@PathVariable Long kd){
        return  filmService.raw_jadwal_film(kd);
    }
    @PostMapping(path = "/")
    public Film add_film(@RequestBody FilmDto filmDto){
        return filmService.set_film(filmDto);
    }
    @PutMapping(path = "/{kd}")
    public Film up_film(@PathVariable Long kd, @RequestBody FilmDto filmDto){
        filmDto.setKdFilm(kd);
        return filmService.set_film(filmDto);
    }
    @DeleteMapping(path = "/{kd}")
    public String delete_film(@PathVariable Long kd){
        if(filmService.delete_film(kd)){
            return "Succes";
        }
        return "Failed";
    }
}
