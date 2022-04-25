package com.binaracademy.Challange4.Service;

import com.binaracademy.Challange4.Dto.FilmDto;
import com.binaracademy.Challange4.Dto.RawJadwalFilmDto;
import com.binaracademy.Challange4.Entity.Film;
import com.binaracademy.Challange4.Repository.FilmRepository;
import com.binaracademy.Challange4.Repository.JadwalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {
    @Autowired
    FilmRepository filmRepository;
    @Autowired
    JadwalRepository jadwalRepository;

    public List<Film> ls_film(){
        return filmRepository.findAll();
    }
    public Optional<Film> ls_film(Long kd){
        return filmRepository.findById(kd);
    }
    public Film set_film(FilmDto filmDto){
        Film film = new Film();
        film.setKdFilm(filmDto.getKdFilm());
        film.setNmFilm(filmDto.getNmFilm());
        film.setStatus(filmDto.getStatus());
        return filmRepository.save(film);
    }
    public Boolean delete_film(Long kd){
        if(filmRepository.existsById(kd)){
            filmRepository.deleteById(kd);
            if(jadwalRepository.existsJadwalByKdFilm(kd)){
                jadwalRepository.deleteJadwalByKdFilm(kd);
            }
            return true;
        }
        return  false;
    }
    public RawJadwalFilmDto raw_jadwal_film(Long kd){
        RawJadwalFilmDto rawJadwalFilmDto = new RawJadwalFilmDto();
        Optional<Film> film = filmRepository.findById(kd);
        rawJadwalFilmDto.setKdFilm(film.get().getKdFilm());
        rawJadwalFilmDto.setNmFilm(film.get().getNmFilm());
        rawJadwalFilmDto.setStatus(film.get().getStatus());
        rawJadwalFilmDto.setJadwal(jadwalRepository.findByKdFilm(kd));
        return rawJadwalFilmDto;
    }

}
