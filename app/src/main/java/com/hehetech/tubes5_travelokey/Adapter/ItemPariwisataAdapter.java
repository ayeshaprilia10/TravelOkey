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
import com.hehetech.tubes5_travelokey.Entity.Pariwisata.ItemPariwisata;
import com.hehetech.tubes5_travelokey.R;

import java.util.ArrayList;

public class ItemPariwisataAdapter extends RecyclerView.Adapter<ItemPariwisataAdapter.ListViewHolder> {

    private ArrayList<ItemPariwisata> listItemPariwisata;
    public ItemPariwisataAdapter(ArrayList<ItemPariwisata> list) {this.listItemPariwisata = list;}

    private ItemPariwisataAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(ItemPariwisataAdapter.OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ItemPariwisataAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_showcase_pesawat,viewGroup, false);
        return new ItemPariwisataAdapter.ListViewHolder(view);
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
    public void onBindViewHolder(@NonNull ItemPariwisataAdapter.ListViewHolder holder, int position) {
        ItemPariwisata itemPariwisata = listItemPariwisata.get(position);
        Glide.with(holder.itemView.getContext())
                .load(itemPariwisata.getPhotoThumbnail())
                .apply(new RequestOptions().override(100,150))
                .into(holder.imgPhoto);
        holder.tvNamaPengelola.setText(itemPariwisata.getNama_pengelola());
        holder.tvFasilitas.setText(itemPariwisata.getFasilitas());

        //OnClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listItemPariwisata.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listItemPariwisata.size();
    }


    //OnClick Interface
    public interface OnItemClickCallback{
        void onItemClicked(ItemPariwisata data);
    }
}
