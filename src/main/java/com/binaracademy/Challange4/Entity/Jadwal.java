package com.binaracademy.Challange4.Entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import  java.sql.Date;

@Entity
@Table(name = "jadwal")
public class Jadwal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jadwal")
    private Long idJadwal;
    @Column(name = "kd_film")
    private Long kdFilm;
    @Column(name = "tgl_tayang")
    private Date tglTayang;
    @Column(name = "jm_mulai")
    private Time jmMulai;
    @Column(name = "jm_selesai")
    private Time jmSelesai;
    @Column(name = "hg_tiket")
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
