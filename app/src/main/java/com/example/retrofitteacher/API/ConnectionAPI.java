package com.example.retrofitteacher.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConnectionAPI {
    public final static String url_base = "http://192.168.1.29:8080/";
    private static Retrofit retrofit;

    public static Retrofit RetConnAPI(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(url_base)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}