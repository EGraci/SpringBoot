package com.binaracademy.Challange4.Dto;

import com.binaracademy.Challange4.Entity.Jadwal;

import java.util.List;
import java.util.Optional;

public class RawJadwalFilmDto {
    private Long kdFilm;
    private String nmFilm;
    private Boolean status;
    private List<Jadwal> jadwal;

    public Long getKdFilm() {
        return kdFilm;
    }

    public void setKdFilm(Long kdFilm) {
        this.kdFilm = kdFilm;
    }

    public String getNmFilm() {
        return nmFilm;
    }

    public void setNmFilm(String nmFilm) {
        this.nmFilm = nmFilm;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Jadwal> getJadwal() {
        return jadwal;
    }

    public void setJadwal(List<Jadwal> jadwal) {
        this.jadwal = jadwal;
    }
}
