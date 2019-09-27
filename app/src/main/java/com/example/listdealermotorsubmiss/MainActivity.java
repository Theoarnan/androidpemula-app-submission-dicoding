package com.example.listdealermotorsubmiss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView rvMotors;
    private ArrayList<Motor> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvMotors = findViewById(R.id.rv_motor);
        rvMotors.setHasFixedSize(true);
        list.addAll(DaftarMotor.getListData());
        showRecyclerList();

    }
//    private void setActionBarTitle(String title) {
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setTitle(title);
//        }
//    }

    private void showRecyclerList() {
        rvMotors.setLayoutManager(new LinearLayoutManager(this));
        DaftarMotorAdapter listMotorAdapter = new DaftarMotorAdapter(list);
        rvMotors.setAdapter(listMotorAdapter);


        listMotorAdapter.setOnItemClickCallback(new DaftarMotorAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Motor data) {
                tampil();
            }
        });
    }
    private void tampil(){
        DetailAdapter detailAdapter = new DetailAdapter(list);
        rvMotors.setAdapter(detailAdapter);
        rvMotors.setLayoutManager(new LinearLayoutManager(this));

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.mmProfile:
                Intent moveIntent = new Intent(MainActivity.this, ProfileMy.class);
                startActivity(moveIntent);
                break;
        }
    }
}
