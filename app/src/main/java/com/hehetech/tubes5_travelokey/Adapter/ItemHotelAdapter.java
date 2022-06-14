package com.hehetech.tubes5_travelokey.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.hehetech.tubes5_travelokey.Entity.Hotels.ItemHotels;
import com.hehetech.tubes5_travelokey.Entity.Pariwisata.ItemPariwisata;
import com.hehetech.tubes5_travelokey.R;

import java.util.ArrayList;

public class ItemHotelAdapter extends RecyclerView.Adapter<ItemHotelAdapter.ListViewHolder> {

    private ArrayList<ItemHotels> listItemHotel;
    public ItemHotelAdapter(ArrayList<ItemHotels> list) {this.listItemHotel = list;}

    private ItemHotelAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(ItemHotelAdapter.OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ItemHotelAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_showcase_pesawat,viewGroup, false);
        return new ItemHotelAdapter.ListViewHolder(view);
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvNamaPengelola, tvFasilitas;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.image_pesawat);
            tvNamaPengelola = itemView.findViewById(R.id.title_pesawat);
            tvFasilitas = itemView.findViewById(R.id.deskripsi_pesawat);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHotelAdapter.ListViewHolder holder, int position) {
        ItemHotels itemHotels = listItemHotel.get(position);
        Glide.with(holder.itemView.getContext())
                .load(itemHotels.getPhotoThumbnail())
                .apply(new RequestOptions().override(100,150))
                .into(holder.imgPhoto);
        holder.tvNamaPengelola.setText(itemHotels.getNama_pengelola());
        holder.tvFasilitas.setText(itemHotels.getFasilitas());

        //OnClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listItemHotel.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listItemHotel.size();
    }


    //OnClick Interface
    public interface OnItemClickCallback{
        void onItemClicked(ItemHotels data);
    }
}
