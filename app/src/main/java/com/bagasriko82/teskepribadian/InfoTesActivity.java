package com.bagasriko82.teskepribadian;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoTesActivity extends AppCompatActivity {

    TextView HakCipta;
    TextView ApaItuKepribadian;
    Button MenuUtama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tes);

        HakCipta=findViewById(R.id.keteranganHakCipta);
        ApaItuKepribadian=findViewById(R.id.apaItuKepribadian);
        MenuUtama=findViewById(R.id.MainMenu);

        HakCipta.setText("Please note: This self-test is meant to give you insight in your mood state. "+
                "This test is explicitly not suitable for diagnosis.This test can not replace professional help. When in doubt, please contact your general practitioner." +
                " No rights can be derived from the results of this test.");

        MenuUtama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(c);
            }
        });

    }

    public void pencarian1(View view){
        Intent pencarianIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(pencarianIntent);
    }

    public void pencarian2(View view){
        Intent pencarian2Intent=new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(pencarian2Intent);
    }

    public void pencarian3(View view){
        Intent pencarian3Intent=new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(pencarian3Intent);
    }

    public void pencarian4(View view){
        Intent pencarian4Intent=new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(pencarian4Intent);
    }

    public void pencarian5(View view){
        Intent pencarian5Intent=new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(pencarian5Intent);
    }

    /*

    public void pencarian6(View view){
        Intent pencarian6Intent=new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(pencarian6Intent);
    }
    */
}
