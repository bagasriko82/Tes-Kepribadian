package com.bagasriko82.teskepribadian;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    TextView Pengenalan;
    Button MulaiTest;
    Button InfoAplikasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pengenalan=(TextView)findViewById(R.id.teks1);
        MulaiTest=(Button)findViewById(R.id.MulaiTest);
        InfoAplikasi=(Button)findViewById(R.id.InfoTes);

        Pengenalan.setText("Gunakan aplikasi ini untuk menguji kepribadianmu dan menilai kepribadianmu" + "\nTes ini hanyalah alat uji sementara");

        MulaiTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),PenggunaActivity.class);
                startActivity(a);

            }
        });

        InfoAplikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent b=new Intent(getApplicationContext(),InfoTesActivity.class);
                startActivity(b);
            }
        });
    }

}
