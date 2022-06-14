package com.hehetech.tubes5_travelokey.Entity.Flight;

import com.hehetech.tubes5_travelokey.R;

import java.util.ArrayList;

public class ItemFlightData {

    private static int [] flightRating = {
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
            R.drawable.plane1,
            R.drawable.plane2,
            R.drawable.plane3,
            R.drawable.plane1,
            R.drawable.plane2,
            R.drawable.plane3,
            R.drawable.plane1,
            R.drawable.plane2,
            R.drawable.plane3,
            R.drawable.plane1,
    };

    private static String [] flightNamaMasakapai = {
            "Garuda Indonesia",
            "Trigana Air Service",
            "Pelita Air",
            "Indonesia AirAsia",
            "Lion Air",
            "Wings Abadi Airlines",
            "Tri-mg Airlines",
            "Nusantara Air",
            "Indonesia Air",
            "Sriwijaya Air"
    };


    private static String [] flightLkBerangkat ={
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

    private static String [] flightLkTujuan ={
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

    private static String [] flightTglBerangkat ={
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
    
    private static String [] flightTglSampai ={
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
    private static String [] flightFasilitas ={
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
    private static String [] flightHarga ={
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
    private static String [] flightJenisTiket ={
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
    

    public static ArrayList<ItemFlight> getListData(){
        ArrayList<ItemFlight> list = new ArrayList<>();
        for(int position = 0; position < flightNamaMasakapai.length; position++){
            ItemFlight itemFlight = new ItemFlight();
            itemFlight.setPhotoThumbnail(photoThumbnail[position]);
            itemFlight.setNama_maskapai(flightNamaMasakapai[position]);
            itemFlight.setRating(flightRating[position]);
            itemFlight.setLokasi_keberangkatan(flightLkBerangkat[position]);
            itemFlight.setLokasi_tujuan(flightLkTujuan[position]);
            itemFlight.setTgl_keberangkatan(flightTglBerangkat[position]);
            itemFlight.setTgl_sampai(flightTglSampai[position]);
            itemFlight.setFasilitas(flightFasilitas[position]);
            itemFlight.setHarga(flightHarga[position]);
            itemFlight.setJenis_tiket(flightJenisTiket[position]);
            list.add(itemFlight);
        }
        return list;
    }


}
