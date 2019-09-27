package com.example.listdealermotorsubmiss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailListActivity extends AppCompatActivity {
    String detailjudul, detaildeskripsi, photoss, detailharga, detailspesifikasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);

        getDetailIntent();
    }
    private void getDetailIntent(){
        detailjudul = getIntent().getStringExtra("judul");
        detaildeskripsi = getIntent().getStringExtra("desk");
        photoss = getIntent().getStringExtra("photo");
        detailharga = getIntent().getStringExtra("harga");

        setDetailIntent(detailjudul, detaildeskripsi, photoss, detailharga);
    }
    public void setDetailIntent(String detailjudul, String detaildeskripsi, String photoss, String detailharga){
        ImageView imageVie = findViewById(R.id.im_desk);
        TextView judull = findViewById(R.id.tx_judul_detail);
        TextView deskripsii = findViewById(R.id.tx_deskripsi_detail);
        TextView hargaa = findViewById(R.id.tx_harga);

        judull.setText(detailjudul);
        deskripsii.setText(detaildeskripsi);
        hargaa.setText(detailharga);
        Glide.with(this)
                .load(photoss)
                .apply(new RequestOptions().override(500, 800))
                .into(imageVie);
    }

}
