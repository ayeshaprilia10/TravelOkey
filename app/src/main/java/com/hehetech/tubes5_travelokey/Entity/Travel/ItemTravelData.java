package com.hehetech.tubes5_travelokey.Entity.Travel;

import com.hehetech.tubes5_travelokey.Entity.Bus.ItemBus;
import com.hehetech.tubes5_travelokey.R;

import java.util.ArrayList;

public class ItemTravelData {
    private static int [] travelRating = {
            5,
            3,
            2,
            5,
            3,
            2,
            5,
            3,
            2,
            5
    };

    private static int [] photoThumbnail = {
            R.drawable.tracel_thumb,
            R.drawable.tracel_thumb,
            R.drawable.tracel_thumb,
            R.drawable.tracel_thumb,
            R.drawable.tracel_thumb,
            R.drawable.tracel_thumb,
            R.drawable.tracel_thumb,
            R.drawable.tracel_thumb,
            R.drawable.tracel_thumb,
            R.drawable.tracel_thumb,
    };

    private static String [] travelNamaPengelola = {
            "Damri",
            "Trans Jakarta",
            "Mayasari Bhakti",
            "Primajasa",
            "Arimbi",
            "Trans Jogja",
            "Trans Musi",
            "Pulo Gebang",
            "Mayasari Bhakti",
            "Arimbi"
    };


    private static String [] travelLkBerangkat ={
            "Mataram",
            "Jakarta",
            "Sabang",
            "Makassar",
            "Banjarmasin",
            "Balikpapan",
            "Padang",
            "Dumai",
            "Bandar Lampung",
            "Magelang"

    };

    private static String [] travelLkTujuan ={
            "Magelang",
            "Bandar Lampung",
            "Padang",
            "Banjarmasin",
            "Sabang",
            "Jakarta",
            "Dumai",
            "Mataram",
            "Makassar",
            "Balikpapan",

    };

    private static String [] travelTglBerangkat ={
            "3 January 2022 06:50",
            "4 January 2022 08:20",
            "9 January 2022 08:35",
            "10 January 2022 11:15",
            "18 January 2022 11:45",
            "23 January 2022 14:25",
            "24 January 2022 14:50",
            "26 January 2022 17:00",
            "28 January 2022 18:25",
            "31 January 2022 18:50"
    };

    private static String [] travelTglSampai ={
            "3 January 2022 08:50",
            "4 January 2022 10:20",
            "9 January 2022 10:35",
            "10 January 2022 13:15",
            "18 January 2022 14:45",
            "23 January 2022 16:25",
            "24 January 2022 16:50",
            "26 January 2022 19:00",
            "28 January 2022 20:25",
            "31 January 2022 20:50"
    };
    private static String [] travelFasilitas ={
            "Tempat duduk lebih luas dengan sandaran lengan. Ruang kaki lebih leluasa sehingga lebih lapang dan mudah untuk merenggangkan kaki.",
            "Kursi bisa diatur menyerupai tempat tidur sehingga penumpang akan lebih nyaman untuk beristirahat. Terdapat layar LCD untuk hiburan dan tempat untuk mengisi daya perangkat elektrik.",
            "Kursi lebar, empuk, dan ada pembatas untuk menjaga privasi. Layar LCD dan headphone disediakan untuk menikmati hiburan selama perjalanan.",
            "Tempat duduk lebih luas dengan sandaran lengan. Ruang kaki lebih leluasa sehingga lebih lapang dan mudah untuk merenggangkan kaki.",
            "Kursi bisa diatur menyerupai tempat tidur sehingga penumpang akan lebih nyaman untuk beristirahat. Terdapat layar LCD untuk hiburan dan tempat untuk mengisi daya perangkat elektrik.",
            "Kursi lebar, empuk, dan ada pembatas untuk menjaga privasi. Layar LCD dan headphone disediakan untuk menikmati hiburan selama perjalanan.",
            "Tempat duduk lebih luas dengan sandaran lengan. Ruang kaki lebih leluasa sehingga lebih lapang dan mudah untuk merenggangkan kaki.",
            "Kursi bisa diatur menyerupai tempat tidur sehingga penumpang akan lebih nyaman untuk beristirahat. Terdapat layar LCD untuk hiburan dan tempat untuk mengisi daya perangkat elektrik.",
            "Kursi lebar, empuk, dan ada pembatas untuk menjaga privasi. Layar LCD dan headphone disediakan untuk menikmati hiburan selama perjalanan.",
            "Tempat duduk lebih luas dengan sandaran lengan. Ruang kaki lebih leluasa sehingga lebih lapang dan mudah untuk merenggangkan kaki."
    };
    private static String [] travelHarga ={
            "270189",
            "220633",
            "206091",
            "144560",
            "249119",
            "214583",
            "224929",
            "149016",
            "297571",
            "200224"
    };
    private static String [] travelJenisTiket ={
            "Ekonomi",
            "Ekonomi Premium",
            "Bisnis",
            "First Class",
            "Ekonomi",
            "Ekonomi Premium",
            "Bisnis",
            "First Class",
            "Ekonomi",
            "Ekonomi Premium"
    };


    public static ArrayList<ItemTravel> getListData(){
        ArrayList<ItemTravel> list = new ArrayList<>();
        for(int position = 0; position < travelNamaPengelola.length; position++){
            ItemTravel itemTravel = new ItemTravel();
            itemTravel.setPhotoThumbnail(photoThumbnail[position]);
            itemTravel.setNama_pengelola(travelNamaPengelola[position]);
            itemTravel.setRating(travelRating[position]);
            itemTravel.setLokasi_keberangkatan(travelLkBerangkat[position]);
            itemTravel.setLokasi_tujuan(travelLkTujuan[position]);
            itemTravel.setTgl_keberangkatan(travelTglBerangkat[position]);
            itemTravel.setTgl_sampai(travelTglSampai[position]);
            itemTravel.setFasilitas(travelFasilitas[position]);
            itemTravel.setHarga(travelHarga[position]);
            itemTravel.setJenis_tiket(travelJenisTiket[position]);
            list.add(itemTravel);
        }
        return list;
    }
}
