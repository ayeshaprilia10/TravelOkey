package com.hehetech.tubes5_travelokey.Entity.Hotels;

public class ItemHotels {
    private int id;
    private String nama_pengelola;
    private int id_pengelola;
    private int rating;
    private int photoThumbnail;
    private String fasilitas;
    private String harga;
    private String lama_menginap;
    private String alamat;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_pengelola() {
        return nama_pengelola;
    }

    public void setNama_pengelola(String nama_pengelola) {
        this.nama_pengelola = nama_pengelola;
    }

    public int getId_pengelola() {
        return id_pengelola;
    }

    public void setId_pengelola(int id_pengelola) {
        this.id_pengelola = id_pengelola;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPhotoThumbnail() {
        return photoThumbnail;
    }

    public void setPhotoThumbnail(int photoThumbnail) {
        this.photoThumbnail = photoThumbnail;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getLama_menginap() {
        return lama_menginap;
    }

    public void setLama_menginap(String lama_menginap) {
        this.lama_menginap = lama_menginap;
    }
}
