package com.binaracademy.Challange4.Dto;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

public class JadwalFilmDto {
    private String nmFilm;
    private BigDecimal hgTiket;
    private Date tglTayang;
    private Time jmMulai;
    private Time jmSelesai;

    public String getNmFilm() {
        return nmFilm;
    }

    public void setNmFilm(String nmFilm) {
        this.nmFilm = nmFilm;
    }

    public BigDecimal getHgTiket() {
        return hgTiket;
    }

    public void setHgTiket(BigDecimal hgTiket) {
        this.hgTiket = hgTiket;
    }

    public Date getTglTayang() {
        return tglTayang;
    }

    public void setTglTayang(Date tglTayang) {
        this.tglTayang = tglTayang;
    }

    public Time getJmMulai() {
        return jmMulai;
    }

    public void setJmMulai(Time jmMulai) {
        this.jmMulai = jmMulai;
    }

    public Time getJmSelesai() {
        return jmSelesai;
    }

    public void setJmSelesai(Time jmSelesai) {
        this.jmSelesai = jmSelesai;
    }
}
