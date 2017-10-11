package com.example.ronnygepeng.makanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TampilDetail extends AppCompatActivity {

    ImageView gambar;
    TextView bahn;
    TextView caraBuat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_detail);
        Bundle b = getIntent().getExtras();
        gambar=(ImageView)findViewById(R.id.gambar);
        bahn=(TextView)findViewById(R.id.bahan);
        caraBuat=(TextView)findViewById(R.id.cara);
        bahn.setText(b.getString("bahan"));
        gambar.setImageResource(b.getInt("gambar"));
        caraBuat.setText(b.getString("cara"));
        setTitle(b.getString("label"));
    }

}
