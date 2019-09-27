package com.example.listdealermotorsubmiss;

public class Motor {
    private String namaM;
    private String deskM;
    private String photo;
    private String harga;


    public Motor(String namaM, String deskM, String photo, String harga) {
        this.namaM = namaM;
        this.deskM = deskM;
        this.photo = photo;
        this.harga = harga;

    }

    public Motor() {
    }

    public String getNamaM() {
        return namaM;
    }

    public void setNamaM(String namaM) {
        this.namaM = namaM;
    }

    public String getDeskM() {
        return deskM;
    }

    public void setDeskM(String deskM) {
        this.deskM = deskM;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }



}
