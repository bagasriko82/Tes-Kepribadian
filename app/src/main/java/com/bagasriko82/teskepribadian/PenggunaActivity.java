package com.bagasriko82.teskepribadian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class PenggunaActivity extends AppCompatActivity {

    EditText userName;
    EditText jenisKelamin;
    RadioButton Usia1;
    RadioButton Usia2;
    RadioButton Usia3;
    RadioButton Usia4;
    RadioButton Usia5;
    RadioButton Usia6;
    TextView Usia;
    Button masukButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengguna);

        userName=(EditText)findViewById(R.id.namaPengguna);
        jenisKelamin=(EditText)findViewById(R.id.JenisKelamin);
        Usia1=findViewById(R.id.usia1);
        Usia2=findViewById(R.id.usia2);
        Usia3=findViewById(R.id.usia3);
        Usia4=findViewById(R.id.usia4);
        Usia5=findViewById(R.id.usia5);
        Usia6=findViewById(R.id.usia6);
        masukButton=(Button)findViewById(R.id.tombolMasuk);
        Usia1.setChecked(false);
        Usia2.setChecked(false);
        Usia3.setChecked(false);
        Usia4.setChecked(false);
        Usia5.setChecked(false);
        Usia6.setChecked(false);

        Usia1.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view){
                if(Usia1.isChecked()==true){
                   Usia2.setChecked(false);
                   Usia3.setChecked(false);
                   Usia4.setChecked(false);
                   Usia5.setChecked(false);
                   Usia6.setChecked(false);
                }
        }
        });

        Usia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Usia2.isChecked()==true){
                    Usia1.setChecked(false);
                    Usia3.setChecked(false);
                    Usia4.setChecked(false);
                    Usia5.setChecked(false);
                    Usia6.setChecked(false);
                }
            }
        });

        Usia3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Usia3.isChecked()==true){
                    Usia2.setChecked(false);
                    Usia1.setChecked(false);
                    Usia4.setChecked(false);
                    Usia5.setChecked(false);
                    Usia6.setChecked(false);
                }
            }
        });

        Usia4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Usia4.isChecked()==true){
                    Usia2.setChecked(false);
                    Usia3.setChecked(false);
                    Usia1.setChecked(false);
                    Usia5.setChecked(false);
                    Usia6.setChecked(false);
                }
            }
        });

        Usia5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Usia5.isChecked()==true){
                    Usia2.setChecked(false);
                    Usia3.setChecked(false);
                    Usia4.setChecked(false);
                    Usia1.setChecked(false);
                    Usia6.setChecked(false);
                }
            }
        });

        Usia6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Usia6.isChecked()==true){
                    Usia2.setChecked(false);
                    Usia3.setChecked(false);
                    Usia4.setChecked(false);
                    Usia5.setChecked(false);
                    Usia1.setChecked(false);
                }
            }
        });

        masukButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(userName.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Maaf kamu belum memasukkan nama kamu",Toast.LENGTH_SHORT).show();
                }

                else if(jenisKelamin.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Maaf kamu belum memasukkan jenis kelaminmu",Toast.LENGTH_SHORT).show();
                }

                else{
                    Intent d=new Intent(PenggunaActivity.this, TesActivity.class);
                    d.putExtra("Nama Pengguna",userName.getText().toString());
                    d.putExtra("Jenis Kelamin",jenisKelamin.getText().toString());
                    startActivity(d);

                }
            }
        });



    }


}
