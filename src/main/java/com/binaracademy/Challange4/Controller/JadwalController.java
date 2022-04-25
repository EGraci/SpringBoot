package com.binaracademy.Challange4.Controller;

import com.binaracademy.Challange4.Dto.JadwalDto;
import com.binaracademy.Challange4.Dto.JadwalFilmDto;
import com.binaracademy.Challange4.Entity.Jadwal;
import com.binaracademy.Challange4.Service.JadwalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jadwal")
public class JadwalController {
    @Autowired
    JadwalService jadwalService;
    @GetMapping(path = "/film/")
    public List<JadwalFilmDto> view_jadwal_film(){
        return jadwalService.ls_jadwal_film();
    }
    @GetMapping(path = "/")
    public List<Jadwal> view_jadwal(){
        return jadwalService.ls_jadwal();
    }
    @GetMapping(path = "/{id}")
    public Optional<Jadwal> view_jadwal(@PathVariable Long id){
        return jadwalService.ls_jadwal(id);
    }
    @PostMapping(path = "/")
    public ResponseEntity<Jadwal> add_jadwal(@RequestBody JadwalDto jadwalDto){
        return  jadwalService.set_jadwal(jadwalDto);
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity<Jadwal> up_jadwal(@PathVariable Long id, @RequestBody JadwalDto jadwalDto){
        jadwalDto.setIdJadwal(id);
        return jadwalService.set_jadwal(jadwalDto);
    }
    @DeleteMapping(path = "/{id}")
    public String delete_jadwal(@PathVariable Long id){
        if(jadwalService.delete_jadwal(id)){
            return "Succes";
        }
        return "Failed";
    }
}
