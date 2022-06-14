package com.hehetech.tubes5_travelokey.Entity.Pariwisata;

import com.hehetech.tubes5_travelokey.R;

import java.util.ArrayList;

public class ItemPariwisataData {

    private static int [] parRating = {
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
            R.drawable.par_thumb,
            R.drawable.par_thumb,
            R.drawable.par_thumb,
            R.drawable.par_thumb,
            R.drawable.par_thumb,
            R.drawable.par_thumb,
            R.drawable.par_thumb,
            R.drawable.par_thumb,
            R.drawable.par_thumb,
            R.drawable.par_thumb,
    };

    private static String [] parNamaPengelola = {
            "Lembang Park and Zoo",
            "Kebun Teh",
            "Pantai Pangandaran",
            "Bandung Zoological Garden",
            "Candi Borobudur",
            "Pantai Kuta",
            "Museum Sribaduga",
            "Museum Geologi",
            "Taman Safari Bogor",
            "Bali Zoo"
    };


    private static String [] parFasilitas ={
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
    private static String [] parHarga ={
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
    private static String [] banyakTiket ={
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
            "Lembang",
            "Lembang",
            "Pangandaran",
            "Bandung",
            "Jawa Tengah",
            "Bali",
            "Bandung",
            "Dago",
            "Bogor",
            "Bali"
    };

    private static String [] tglBooking ={
            "1/1/2022",
            "30/1/2022",
            "15/2/2022",
            "15/2/2022",
            "10/2/2022",
            "4/3/2022",
            "22/6/2022",
            "5/4/2022",
            "10/4/2022",
            "8/3/2022"
    };


    public static ArrayList<ItemPariwisata> getListData(){
        ArrayList<ItemPariwisata> list = new ArrayList<>();
        for(int position = 0; position < parNamaPengelola.length; position++){
            ItemPariwisata itemPariwisata = new ItemPariwisata();
            itemPariwisata.setPhotoThumbnail(photoThumbnail[position]);
            itemPariwisata.setNama_pengelola(parNamaPengelola[position]);
            itemPariwisata.setRating(parRating[position]);
            itemPariwisata.setFasilitas(parFasilitas[position]);
            itemPariwisata.setHarga(parHarga[position]);
            itemPariwisata.setBanyak_tiket(banyakTiket[position]);
            itemPariwisata.setAlamat(alamat[position]);
            itemPariwisata.setTanggal_booking(tglBooking[position]);
            list.add(itemPariwisata);
        }
        return list;
    }
}
