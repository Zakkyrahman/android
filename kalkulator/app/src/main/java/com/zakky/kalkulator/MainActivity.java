package com.zakky.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvhasil;
    EditText ETbil1,ETbil2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        load();
        }

    public void load() {
        tvhasil= findViewById(R.id.tvhasil);
        ETbil1= findViewById(R.id.ETbil1);
        ETbil2=findViewById(R.id.ETbil2);
    }

    public void BTNtambah (View view){

        if (ETbil1.getText().toString().equals("") || ETbil2.getText().toString().equals("")) {
            Toast.makeText( this, "Ada Bilangan Yang Kosong", Toast.LENGTH_SHORT).show();
        }
        else {

            double bil_1 = Double.parseDouble(ETbil1.getText().toString());
            double bil_2 = Double.parseDouble(ETbil2.getText().toString());

            double hasil = bil_1 + bil_2;

            tvhasil.setText(hasil + "");
        }
    }
}