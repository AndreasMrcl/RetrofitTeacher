package com.example.retrofitteacher.MODEL;

public class ModelTeacher {
    String kode;
    String nama;
    String posisi;

    public ModelTeacher(String kode, String nama, String posisi, String key) {
        this.kode = kode;
        this.nama = nama;
        this.posisi = posisi;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

}
