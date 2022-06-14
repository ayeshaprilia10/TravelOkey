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
import com.hehetech.tubes5_travelokey.Entity.Bus.ItemBus;
import com.hehetech.tubes5_travelokey.R;

import java.util.ArrayList;

public class ItemBusAdapter extends RecyclerView.Adapter<ItemBusAdapter.ListViewHolder> {

    private ArrayList<ItemBus> listItemBus;
    public ItemBusAdapter(ArrayList<ItemBus> list) {this.listItemBus = list;}

    private ItemBusAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(ItemBusAdapter.OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ItemBusAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_showcase_pesawat,viewGroup, false);
        return new ItemBusAdapter.ListViewHolder(view);
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
    public void onBindViewHolder(@NonNull ItemBusAdapter.ListViewHolder holder, int position) {
        ItemBus itemBus = listItemBus.get(position);
        Glide.with(holder.itemView.getContext())
                .load(itemBus.getPhotoThumbnail())
                .apply(new RequestOptions().override(100,150))
                .into(holder.imgPhoto);
        holder.tvNamaPengelola.setText(itemBus.getNama_pengelola());
        holder.tvFasilitas.setText(itemBus.getFasilitas());

        //OnClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listItemBus.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listItemBus.size();
    }


    //OnClick Interface
    public interface OnItemClickCallback{
        void onItemClicked(ItemBus data);
    }
}
