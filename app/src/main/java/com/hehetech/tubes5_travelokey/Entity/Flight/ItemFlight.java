package com.hehetech.tubes5_travelokey.Entity.Flight;


public class ItemFlight{

    //Deklarasi
    private int id;
    private String nama_maskapai;
    private int id_pengelola;
    private int rating;
    private int photoThumbnail;
    private String lokasi_keberangkatan;
    private String lokasi_tujuan;
    private String tgl_keberangkatan;
    private String tgl_sampai;
    private String fasilitas;
    private String harga;
    private String jenis_tiket;

    //Setter n Getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_maskapai() {
        return nama_maskapai;
    }

    public void setNama_maskapai(String nama_maskapai) {
        this.nama_maskapai = nama_maskapai;
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

    public String getLokasi_keberangkatan() {
        return lokasi_keberangkatan;
    }

    public void setLokasi_keberangkatan(String lokasi_keberangkatan) {
        this.lokasi_keberangkatan = lokasi_keberangkatan;
    }

    public String getLokasi_tujuan() {
        return lokasi_tujuan;
    }

    public void setLokasi_tujuan(String lokasi_tujuan) {
        this.lokasi_tujuan = lokasi_tujuan;
    }

    public String getTgl_keberangkatan() {
        return tgl_keberangkatan;
    }

    public void setTgl_keberangkatan(String tgl_keberangkatan) {
        this.tgl_keberangkatan = tgl_keberangkatan;
    }

    public String getTgl_sampai() {
        return tgl_sampai;
    }

    public void setTgl_sampai(String tgl_sampai) {
        this.tgl_sampai = tgl_sampai;
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

    public String getJenis_tiket() {
        return jenis_tiket;
    }

    public void setJenis_tiket(String jenis_tiket) {
        this.jenis_tiket = jenis_tiket;
    }

    public int getPhotoThumbnail() {
        return photoThumbnail;
    }

    public void setPhotoThumbnail(int photoThumbnail) {
        this.photoThumbnail = photoThumbnail;
    }
}

