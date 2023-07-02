package com.example.retrofitteacher.INTERFACE;

import com.example.retrofitteacher.MODEL.ModelTeacher;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InterfaceTeacher {
    @GET("guru/")
    Call<List<ModelTeacher>> showTeacher();
}