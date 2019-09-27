package com.example.listdealermotorsubmiss;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DaftarMotorAdapter extends RecyclerView.Adapter<DaftarMotorAdapter.ListViewHolder> {
    private ArrayList<Motor> listMotor;
    private DaftarMotorAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(DaftarMotorAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    public DaftarMotorAdapter(ArrayList<Motor> list) {
        this.listMotor = list;

    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_motor, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Motor motor = listMotor.get(position);
        Glide.with(holder.itemView.getContext())
                .load(motor.getPhoto())
                .apply(new RequestOptions().override(500, 800))
                .into(holder.imgPhoto);
        holder.tvNama.setText(motor.getNamaM());
        holder.tvDesk.setText(motor.getDeskM());
        holder.tvHarg.setText(motor.getHarga());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailListActivity.class);
                intent.putExtra("judul", motor.getNamaM());
                intent.putExtra("desk", motor.getDeskM());
                intent.putExtra("photo", motor.getPhoto());
                intent.putExtra("harga", motor.getHarga());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMotor.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDesk, tvHarg;
        RelativeLayout relativeLayout;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_motor);
            tvNama = itemView.findViewById(R.id.tv_nama_motor);
            tvDesk = itemView.findViewById(R.id.tv_desk_motor);
            tvHarg = itemView.findViewById(R.id.tv_harga);
            relativeLayout =itemView.findViewById(R.id.listd);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Motor data);
    }
}
