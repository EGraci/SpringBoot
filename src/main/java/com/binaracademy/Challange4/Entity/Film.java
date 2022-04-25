package com.binaracademy.Challange4.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kd_film")
    private Long kdFilm;
    @Column(name = "nm_film")
    private String nmFilm;
    @Column(name = "status")
    private Boolean status;

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
}
