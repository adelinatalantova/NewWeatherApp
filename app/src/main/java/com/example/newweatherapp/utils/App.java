package com.example.newweatherapp.utils;


import com.example.newweatherapp.data.remote.RetrofitClient;
import com.example.newweatherapp.data.remote.WeatherApi;
import com.example.newweatherapp.data.repository.WeatherRepository;

import android.app.Application;

import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
