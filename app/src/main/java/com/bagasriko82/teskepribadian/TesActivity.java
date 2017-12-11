package com.bagasriko82.teskepribadian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class TesActivity extends AppCompatActivity{
    /* ck = checkbutton

     */

    String namaPengguna;
    String jenisKelamin;
    String hasilPilihan;

    TextView Instruksi;
    TextView Pertanyaan1;
    RadioButton ck10;
    RadioButton ck11;
    RadioButton ck12;
    RadioButton ck13;
    TextView Pertanyaan2;
    RadioButton ck20;
    RadioButton ck21;
    RadioButton ck22;
    RadioButton ck23;
    TextView Pertanyaan3;
    RadioButton ck30;
    RadioButton ck31;
    RadioButton ck32;
    RadioButton ck33;
    TextView Pertanyaan4;
    RadioButton ck40;
    RadioButton ck41;
    RadioButton ck42;
    RadioButton ck43;
    TextView Pertanyaan5;
    RadioButton ck50;
    RadioButton ck51;
    RadioButton ck52;
    RadioButton ck53;
    TextView Pertanyaan6;
    RadioButton ck60;
    RadioButton ck61;
    RadioButton ck62;
    RadioButton ck63;
    TextView Pertanyaan7;
    RadioButton ck70;
    RadioButton ck71;
    RadioButton ck72;
    RadioButton ck73;
    TextView Pertanyaan8;
    RadioButton ck80;
    RadioButton ck81;
    RadioButton ck82;
    RadioButton ck83;
    TextView Pertanyaan9;
    RadioButton ck90;
    RadioButton ck91;
    RadioButton ck92;
    RadioButton ck93;
    TextView Pertanyaan10;
    RadioButton ck100;
    RadioButton ck101;
    RadioButton ck102;
    RadioButton ck103;
    Button hasil;



    int a=0, b=0, c=0, d=0;
    int nilaiTerbanyak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tes);

        ck10 = findViewById(R.id.checkBox10);
        ck11 = findViewById(R.id.checkBox11);
        ck12 = findViewById(R.id.checkBox12);
        ck13 = findViewById(R.id.checkBox13);

        /*
        Batas 1
         */

        ck20 = findViewById(R.id.checkBox20);
        ck21 = findViewById(R.id.checkBox21);
        ck22 = findViewById(R.id.checkBox22);
        ck23 = findViewById(R.id.checkBox23);

        /*
        Batas 2
         */

        ck30 = findViewById(R.id.checkBox30);
        ck31 = findViewById(R.id.checkBox31);
        ck32 = findViewById(R.id.checkBox32);
        ck33 = findViewById(R.id.checkBox33);

        /*
        Batas 3
         */

        ck40 = findViewById(R.id.checkBox40);
        ck41 = findViewById(R.id.checkBox41);
        ck42 = findViewById(R.id.checkBox42);
        ck43 = findViewById(R.id.checkBox43);

        /*
        Batas 4
         */

        ck50 = findViewById(R.id.checkBox50);
        ck51 = findViewById(R.id.checkBox51);
        ck52 = findViewById(R.id.checkBox52);
        ck53 = findViewById(R.id.checkBox53);

        /*
        Batas 5
         */

        /*
        Dibuat kondisi awal nya false
         */
        ck10.setChecked(false);
        ck11.setChecked(false);
        ck12.setChecked(false);
        ck13.setChecked(false);
        ck20.setChecked(false);
        ck21.setChecked(false);
        ck22.setChecked(false);
        ck23.setChecked(false);
        ck30.setChecked(false);
        ck31.setChecked(false);
        ck32.setChecked(false);
        ck33.setChecked(false);
        ck40.setChecked(false);
        ck41.setChecked(false);
        ck42.setChecked(false);
        ck43.setChecked(false);
        ck50.setChecked(false);
        ck51.setChecked(false);
        ck52.setChecked(false);
        ck53.setChecked(false);

        namaPengguna = getIntent().getStringExtra("Nama Pengguna");
        jenisKelamin = getIntent().getStringExtra("Jenis Kelamin");

        Instruksi = findViewById(R.id.instruksi);
        Instruksi.setText("Pilih jawabang yang paling cocok dan sesuai dengan diri Anda ^_^");

        hasil = (Button) findViewById(R.id.tombolSubmit);
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opsiJawaban();
                pilihTerbanyak();
                Toast.makeText(getApplicationContext(),"total skor " +nilaiTerbanyak ,Toast.LENGTH_SHORT).show();
                cekKepribadian();
                /*
                Intent e=new Intent(getApplicationContext(),HasilTesActivity.class);
                e.putExtra("Nama Pengguna",namaPengguna);
                e.putExtra("Jenis Kelamin",jenisKelamin);
                e.putExtra("Cek Kepribadian",hasilPilihan);
                startActivity(e);
                */
                reset();
            }
        });



        ck10.setText("A. Populer");
        ck11.setText("B. Produktif");
        ck12.setText("C. Perfeksionis");
        ck13.setText("D. Pendengar Yang Baik");


        ck20.setText("A. Tidak konsisten");
        ck21.setText("B. Suka memaksa");
        ck22.setText("C. Memiliki standar tinggi");
        ck23.setText("D. Sulit memutuskan");


        ck30.setText("A. Senang mendapat ujian");
        ck31.setText("B. Pekerja keras");
        ck32.setText("C. Memiliki standar tinggi");
        ck33.setText("D. Sulit memutuskan");



        ck40.setText("A. Tidak teratur");
        ck41.setText("B. Keras kepala");
        ck42.setText("C. Terlalu perasa");
        ck43.setText("D. Mundur dari situasi sulit");



        ck50.setText("A. Iseng & usil");
        ck51.setText("B. Tidak sensitif");
        ck52.setText("C. Suka keindahan");
        ck53.setText("D. Malas / lambat");


    }

    public void opsiJawaban(){

        if(ck10.isChecked()==true){
            a=a+1;
        }
        if(ck11.isChecked()==true){
            b=b+1;
        }
        if(ck12.isChecked()==true){
            c=c+1;
        }
        if(ck13.isChecked()==true){
            d=d+1;
        }

        if(ck20.isChecked()==true){
            a=a+1;
        }
        if(ck21.isChecked()==true){
            b=b+1;
        }
        if(ck22.isChecked()==true){
            c=c+1;
        }
        if(ck23.isChecked()==true){
            d=d+1;
        }

        if(ck30.isChecked()==true){
            a=a+1;
        }
        if(ck31.isChecked()==true){
            b=b+1;
        }
        if(ck32.isChecked()==true){
            c=c+1;
        }
        if(ck33.isChecked()==true){
            d=d+1;
        }

        if(ck40.isChecked()==true){
            a=a+1;
        }
        if(ck41.isChecked()==true){
            b=b+1;
        }
        if(ck42.isChecked()==true){
            c=c+1;
        }
        if(ck43.isChecked()==true){
            d=d+1;
        }

        if(ck50.isChecked()==true){
            a=a+1;
        }
        if(ck51.isChecked()==true){
            b=b+1;
        }
        if(ck52.isChecked()==true){
            c=c+1;
        }
        if(ck53.isChecked()==true){
            d=d+1;
        }

    }

    public void pilihTerbanyak(){
        nilaiTerbanyak=(a>=b)?a:b;
        nilaiTerbanyak=(nilaiTerbanyak>=c)?c:nilaiTerbanyak;
        nilaiTerbanyak=(nilaiTerbanyak>=d)?d:nilaiTerbanyak;
    }

    public void reset(){
        a=0;
        b=0;
        c=0;
        d=0;
    }

    public void cekKepribadian(){
        if(nilaiTerbanyak==a){
            hasilPilihan="Sanguinis. Sanguinis adalah orang yang sangat bersemangat dalam hidup";
        }

        else if(nilaiTerbanyak==b){
            hasilPilihan="Kolerik. Koleris adalah memiliki kemauan keras dalam mencapai sesuatu";
        }

        else if (nilaiTerbanyak==c){
            hasilPilihan="Melakolis. Orang melakolis memiliki rasa seni yang tinggi, kemampuan analitis yang kuat, perfeksiosionis, sensitif, berbakat dan rela berkorban";

        }
        else{
            hasilPilihan="Phlegmatis. Orang phlegmatis memiliki sifat alamiah pendamai dan menghindari kekerasan";
        }
    }


}
