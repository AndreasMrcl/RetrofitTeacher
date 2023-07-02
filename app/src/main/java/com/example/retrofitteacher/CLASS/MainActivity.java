package com.example.retrofitteacher.CLASS;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.retrofitteacher.ADAPTOR.AdaptorTeacher;
import com.example.retrofitteacher.API.ConnectionAPI;
import com.example.retrofitteacher.INTERFACE.InterfaceTeacher;
import com.example.retrofitteacher.MODEL.ModelTeacher;
import com.example.retrofitteacher.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    InterfaceTeacher interfacePegawai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvTeacher);
        interfacePegawai = ConnectionAPI.RetConnAPI().create(InterfaceTeacher.class);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        readData();
    }

    private void readData() {
        Call<List<ModelTeacher>> pegawaiCall = interfacePegawai.showTeacher();
        pegawaiCall.enqueue(new Callback<List<ModelTeacher>>() {
            @Override
            public void onResponse(Call<List<ModelTeacher>> call, Response<List<ModelTeacher>> response) {
                ArrayList<ModelTeacher> arrayList = (ArrayList<ModelTeacher>) response.body();
                AdaptorTeacher adapterPegawai = new AdaptorTeacher(arrayList);
                recyclerView.setAdapter(adapterPegawai);
            }

            @Override
            public void onFailure(Call<List<ModelTeacher>> call, Throwable t) {

            }
        });
    }
}