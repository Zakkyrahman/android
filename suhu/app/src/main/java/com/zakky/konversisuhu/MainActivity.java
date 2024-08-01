package com.zakky.konversisuhu;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText etnilai;
    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        load();

        }

        public void  load(){
            spinner = findViewById(R.id.spinner);
            etnilai = findViewById(R.id.etnilai);
            tvhasil = findViewById(R.id.tvhasil);
    }
        /*
        public void isiSpinner() {
        String[] isi = {"Celcius to Reamur", "Celcius To Farenheit", "Celcius To Kelvin"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,isi);
        spinner.setAdapter(adapter);
    }
         */

//    public void load(){
//        spinner = findViewById(R.id.spinner);
//        etnilai = findViewById(R.id.etnilai);
//    }

    public void btnkon (View view){
        String Pilihan = spinner.getSelectedItem().toString();

        if (etnilai.getText().toString().equals("")){
            Toast.makeText(this, "Nilai Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        }else {
            if (Pilihan.equals("Celcius To Reamur")){
                cToR();
            }
            if (Pilihan.equals("Celcius To Fahrenheit")){
                cToF();
            }
            if (Pilihan.equals("Celcius To Kelvin")){
                cToK();
            }
        }
    }

    public void cToR(){
        double suhu = Double.parseDouble(etnilai.getText().toString());
        double hasil = (4.0/5.0) * suhu;

        tvhasil.setText(hasil + "");
    }
    public void cToF() {
        Toast.makeText(this, "Belum Dibuat", Toast.LENGTH_SHORT).show();
    }
    public void cToK(){
        Toast.makeText(this, "Belum Dibuat", Toast.LENGTH_SHORT).show();
    }
}