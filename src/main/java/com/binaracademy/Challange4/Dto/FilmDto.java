package com.binaracademy.Challange4.Dto;

public class FilmDto {
    private Long kdFilm;
    private String nmFilm;
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
