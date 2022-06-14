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
import com.hehetech.tubes5_travelokey.R;
import com.hehetech.tubes5_travelokey.Entity.Flight.ItemFlight;

import java.util.ArrayList;

public class ItemFlightAdapter extends RecyclerView.Adapter<ItemFlightAdapter.ListViewHolder> {

    private ArrayList<ItemFlight> listItemFlight;
    public ItemFlightAdapter(ArrayList<ItemFlight> list) {this.listItemFlight = list;}

    //OnClick
    private OnItemClickCallback onItemClickCallback;

    //OnClick Method
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_showcase_pesawat,viewGroup, false);
        return new ListViewHolder(view);
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvNamaMaskapai, tvFasilitas;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.image_pesawat);
            tvNamaMaskapai = itemView.findViewById(R.id.title_pesawat);
            tvFasilitas = itemView.findViewById(R.id.deskripsi_pesawat);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        ItemFlight itemFlight = listItemFlight.get(position);
        Glide.with(holder.itemView.getContext())
                .load(itemFlight.getPhotoThumbnail())
                .apply(new RequestOptions().override(100,150))
                .into(holder.imgPhoto);
        holder.tvNamaMaskapai.setText(itemFlight.getNama_maskapai());
        holder.tvFasilitas.setText(itemFlight.getFasilitas());

        //OnClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listItemFlight.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listItemFlight.size();
    }


    //OnClick Interface
    public interface OnItemClickCallback{
        void onItemClicked(ItemFlight data);
    }


}
