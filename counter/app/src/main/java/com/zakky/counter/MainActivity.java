package com.zakky.counter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int count = 0;
     TextView tvhasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        load();

    }


        public void load(){
            tvhasil = findViewById(R.id.tvhasil);
        }

        public void btnup(View view){
        count ++;
            tvhasil.setText(count+"");
        }

        public void btndown(View view) {
        count--;
            tvhasil.setText(count+"");
        }
}