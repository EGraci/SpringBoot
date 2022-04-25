package com.binaracademy.Challange4.Service;

import com.binaracademy.Challange4.Dto.JadwalDto;
import com.binaracademy.Challange4.Dto.JadwalFilmDto;
import com.binaracademy.Challange4.Entity.Film;
import com.binaracademy.Challange4.Entity.Jadwal;
import com.binaracademy.Challange4.Repository.FilmRepository;
import com.binaracademy.Challange4.Repository.JadwalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JadwalService {
    @Autowired
    JadwalRepository jadwalRepository;
    @Autowired
    FilmRepository filmRepository;
    public List<JadwalFilmDto> ls_jadwal_film(){
        List<Jadwal> raw = jadwalRepository.findAll();
        List<JadwalFilmDto> lsJadwal = new ArrayList<>();
        for (Jadwal i : raw) {
            JadwalFilmDto jadwal = new JadwalFilmDto();
            Optional<Film> film = filmRepository.findById(i.getKdFilm());
            jadwal.setNmFilm(film.get().getNmFilm());
            jadwal.setHgTiket(i.getHgTiket());
            jadwal.setTglTayang(i.getTglTayang());
            jadwal.setJmMulai(i.getJmMulai());
            jadwal.setJmSelesai(i.getJmSelesai());
            lsJadwal.add(jadwal);
        }
        return lsJadwal;

    }
    public List<Jadwal> ls_jadwal(){
        return jadwalRepository.findAll();
    }
    public Optional<Jadwal> ls_jadwal(Long id){
        return jadwalRepository.findById(id);
    }
    public ResponseEntity<Jadwal> set_jadwal(JadwalDto jadwalDto){
        Jadwal jadwal = new Jadwal();
        if(filmRepository.existsById(jadwalDto.getKdFilm())){
            jadwal.setKdFilm(jadwalDto.getKdFilm());
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        jadwal.setJmMulai(jadwalDto.getJmMulai());
        jadwal.setJmSelesai(jadwalDto.getJmSelesai());
        jadwal.setTglTayang(jadwalDto.getTglTayang());
        jadwal.setHgTiket(jadwalDto.getHgTiket());
        jadwal = jadwalRepository.save(jadwal);
        return new ResponseEntity<>(jadwal, HttpStatus.OK);
    }
    public Boolean delete_jadwal(Long id) {
        if (jadwalRepository.existsById(id)) {
            jadwalRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
