package com.example.ronnygepeng.makanan;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ronny gepeng on 10/5/2017.
 */

class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView tv1,tv2; //deklarasi textview
    ImageView imageView;  //deklarasi imageview

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.daftar_judul);

        tv2= (TextView) itemView.findViewById(R.id.daftar_deskripsi);
        imageView=(ImageView)itemView.findViewById(R.id.imageView);
    }
}
