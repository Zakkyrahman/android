package com.zakky.intenactivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Barang extends AppCompatActivity {


    TextView tvbarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_barang);

        load();
        ambildata();
    }
    public void load(){
        tvbarang = findViewById(R.id.tvbarang);
    }

    public void ambildata(){
        String ambil = getIntent().getStringExtra("ISI");
        tvbarang.setText(ambil);
    }

}