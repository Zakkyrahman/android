package com.zakky.messagedialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void showToast(String pesan) {
        Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show();
    }
    public void showAlert(String pesan){
        AlertDialog.Builder buatAlert = new AlertDialog.Builder(this);
        buatAlert.setTitle("PERHATIAN !");
        buatAlert.setMessage(pesan);

        buatAlert.show();
    }

    public void showAlertButton(String pesan){
        AlertDialog.Builder showAlert = new AlertDialog.Builder(this);
        showAlert.setTitle("PERINGATAN");
        showAlert.setMessage(pesan);

        showAlert.setPositiveButton("YA", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast("Data Sudah Dihapus");
            }
        });

        showAlert.setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast("Data Tidak Dihapus");
            }
        });

        showAlert.show();
    }

    public void btntoast(View view){
        showToast("Belajar Membuat Pesan");
    }
    public void btnad(View view){
        showAlert("Selamat");
    }
    public void btnadb(View view){
        showAlertButton("Yakin Akan Menghapus");
    }
}