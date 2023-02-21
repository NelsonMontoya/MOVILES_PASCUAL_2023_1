package com.movilespascual.clase20febero2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    // Aqui se ponen las variables que se van a usar globalmente
    String TAG = "ActividadUno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"--OnCreate--"); //Para depuración
    }


}