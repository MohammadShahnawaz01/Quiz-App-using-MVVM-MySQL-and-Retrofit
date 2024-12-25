package com.example.thequizapp.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    // Always use 10.0.2.2 to connect emulator to the host's server
    String baseUrl = "http://127.0.0.1:8080/quiz/";

    // Create and return a configured Retrofit Instance
    public Retrofit getRetrofitInstance(){
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
