package com.example.listdealermotorsubmiss;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ListViewHolder> {
    private ArrayList<Motor> listMotor;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    public DetailAdapter(ArrayList<Motor> list) {
        this.listMotor = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_detail_list, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Motor motor = listMotor.get(position);
        Glide.with(holder.itemView.getContext())
                .load(motor.getPhoto())
                .apply(new RequestOptions().override(500, 800))
                .into(holder.imgPhoto);
        holder.tvNama.setText(motor.getNamaM());
        holder.tvDesk.setText(motor.getDeskM());
        holder.tvHarg.setText(motor.getHarga());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  onItemClickCallback.onItemClicked(listMotor.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMotor.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDesk, tvHarg, tvSpesi;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.im_desk);
            tvNama = itemView.findViewById(R.id.tx_judul_detail);
            tvDesk = itemView.findViewById(R.id.tx_deskripsi_detail);
            tvHarg = itemView.findViewById(R.id.tx_harga);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Motor data);
    }
}
