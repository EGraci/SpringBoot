package com.binaracademy.Challange4.Dto;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Date;


public class JadwalDto {
    private Long idJadwal;
    private Long kdFilm;
    private Date tglTayang;
    private Time jmMulai;
    private Time jmSelesai;
    private BigDecimal hgTiket;

    public Long getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(Long idJadwal) {
        this.idJadwal = idJadwal;
    }

    public Long getKdFilm() {
        return kdFilm;
    }

    public void setKdFilm(Long kdFilm) {
        this.kdFilm = kdFilm;
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

    public BigDecimal getHgTiket() {
        return hgTiket;
    }

    public void setHgTiket(BigDecimal hgTiket) {
        this.hgTiket = hgTiket;
    }
}
