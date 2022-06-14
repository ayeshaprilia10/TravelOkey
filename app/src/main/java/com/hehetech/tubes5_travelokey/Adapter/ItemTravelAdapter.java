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
import com.hehetech.tubes5_travelokey.Entity.Travel.ItemTravel;
import com.hehetech.tubes5_travelokey.R;

import java.util.ArrayList;

public class ItemTravelAdapter extends RecyclerView.Adapter<ItemTravelAdapter.ListViewHolder> {

    private ArrayList<ItemTravel> listItemTravel;
    public ItemTravelAdapter(ArrayList<ItemTravel> list) {this.listItemTravel = list;}

    private ItemTravelAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(ItemTravelAdapter.OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ItemTravelAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_showcase_pesawat,viewGroup, false);
        return new ItemTravelAdapter.ListViewHolder(view);
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
    public void onBindViewHolder(@NonNull ItemTravelAdapter.ListViewHolder holder, int position) {
        ItemTravel itemTravel = listItemTravel.get(position);
        Glide.with(holder.itemView.getContext())
                .load(itemTravel.getPhotoThumbnail())
                .apply(new RequestOptions().override(100,150))
                .into(holder.imgPhoto);
        holder.tvNamaPengelola.setText(itemTravel.getNama_pengelola());
        holder.tvFasilitas.setText(itemTravel.getFasilitas());

        //OnClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listItemTravel.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listItemTravel.size();
    }


    //OnClick Interface
    public interface OnItemClickCallback{
        void onItemClicked(ItemTravel data);
    }
}
