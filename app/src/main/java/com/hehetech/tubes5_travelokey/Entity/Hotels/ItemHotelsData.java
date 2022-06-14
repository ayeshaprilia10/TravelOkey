package com.hehetech.tubes5_travelokey.Entity.Hotels;

import com.hehetech.tubes5_travelokey.R;

import java.util.ArrayList;

public class ItemHotelsData {
    private static int [] hotelRating = {
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
            R.drawable.hotel_thumb,
            R.drawable.hotel_thumb,
            R.drawable.hotel_thumb,
            R.drawable.hotel_thumb,
            R.drawable.hotel_thumb,
            R.drawable.hotel_thumb,
            R.drawable.hotel_thumb,
            R.drawable.hotel_thumb,
            R.drawable.hotel_thumb,
            R.drawable.hotel_thumb,
    };

    private static String [] hotelNamaPengelola = {
            "RedDoors",
            "Komaneka",
            "Mulia Villas",
            "Ayung Resort",
            "The Oberoi",
            "The Samaya",
            "Amanjiwo Resort",
            "The Mulia",
            "The St Regis",
            "Lembang Resort"
    };


    private static String [] hotelFasilitas ={
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
    private static String [] hotelHarga ={
            "500000",
            "300000",
            "365098",
            "490874",
            "900879",
            "209876",
            "908762",
            "100000",
            "468760",
            "980874"
    };
    private static String [] lamaMenginap ={
            "1",
            "1",
            "1",
            "2",
            "5",
            "2",
            "1",
            "1",
            "1",
            "1"
    };

    private static String [] alamat ={
            "Bali",
            "Bandung",
            "Bali",
            "Lombok",
            "Jawa Timur",
            "Yogyakarta",
            "Aceh",
            "Bali",
            "Nusa Tenggara Timur",
            "Lembang"
    };


    public static ArrayList<ItemHotels> getListData(){
        ArrayList<ItemHotels> list = new ArrayList<>();
        for(int position = 0; position < hotelNamaPengelola.length; position++){
            ItemHotels itemHotels = new ItemHotels();
            itemHotels.setPhotoThumbnail(photoThumbnail[position]);
            itemHotels.setNama_pengelola(hotelNamaPengelola[position]);
            itemHotels.setRating(hotelRating[position]);
            itemHotels.setFasilitas(hotelFasilitas[position]);
            itemHotels.setHarga(hotelHarga[position]);
            itemHotels.setLama_menginap(lamaMenginap[position]);
            itemHotels.setAlamat(alamat[position]);
            list.add(itemHotels);
        }
        return list;
    }
}
