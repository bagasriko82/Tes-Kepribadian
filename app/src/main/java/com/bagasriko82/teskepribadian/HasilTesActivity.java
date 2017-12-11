package com.bagasriko82.teskepribadian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilTesActivity extends AppCompatActivity {

    TextView hasilTes;
    TextView keterangan;
    Button kembaliKeMenu;
    String nilaiAkhir;
    String namaAkhir;
    String kelaminAkhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_tes);

        hasilTes=(TextView)findViewById(R.id.hasilTes);
        keterangan=(TextView)findViewById(R.id.Keterangan);
        kembaliKeMenu=findViewById(R.id.tombolMenu);


        namaAkhir=getIntent().getStringExtra("Nama Pengguna");
        kelaminAkhir=getIntent().getStringExtra("Jenis Kelamin");
        nilaiAkhir=getIntent().getStringExtra("Cek Kepribadian");

        keterangan.setText((namaAkhir)+" berkelamin "+(kelaminAkhir)+" mempunyai kepribadian "+(nilaiAkhir));

        kembaliKeMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(f);
            }
        });



        }


    }


