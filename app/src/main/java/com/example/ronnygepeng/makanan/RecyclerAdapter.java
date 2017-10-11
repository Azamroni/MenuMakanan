package com.example.ronnygepeng.makanan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ronny gepeng on 10/5/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private final Context context;

    String [] name={"Gurame Asam Manis","Gurame Gulai","Gurame Bakar","Gurame Terbang","Gurame Tepung Asam Manis"};
    String [] bahan={"1 ekor (1 kg) ikan gurame, dibersihkan dan buang isi perutnya \n 2 sendok makan tepung kanji\n ½ sdt. garam\n minyak goreng secukupnyajbb\n \nBahan Untuk Saus :\n\n500 gram tomat merah\n150 cc air\n1 sdm margarin\n3 butir bawang merah, iris tipis\n2 siung bawang putih, iris tipis\n3 cabe merah, iris tipis memanjang\n4 cm jahe, iris tipis memanjang\n10 batang lokio\n1 sdt garam\n1 sdm gula pasir\n1 sdm cuka\n1 sdm bumbu penyedap\n4 sdm saus tomat botol\n1 sdt tepung kanji, diaduk dengan sedikit air\n","½ kg ikan gurame ukuran sedang\n750 ml santan kental\n4 buah belimbing wuluh, dipotong-potong bulat\nDaun kemangi secukupnya ambil daunnya\nAir Jeruk untuk melumuri ikan\n\nBahan Bumbu Yang Dihaluskan :\n\n9 buah bawang merah\n6 buah bawang putih\n7 butir kemiri\n2 ruas jari kunyit\n3 ruas jari jahe\n2 sendok teh ketumbar\n\nBahan Bumbu Lainya : \n\n3 lembar daun salam\n3 lembar daun jeruk\n2 batang sereh, digeprek\n3 buah cabe ijo potong-potong ukuran sedang\n3 buah cabe merah potong-potong ukurang sedang\nGula secukupnya\ngaram secukupnya","3 lembar daun salam\n3 lembar daun jeruk\n2 batang sereh, digeprek\n3 buah cabe ijo potong-potong ukuran sedang\n3 buah cabe merah potong-potong ukurang sedang\nGula secukupnya\ngaram secukupnya","2 ekor ikan gurame, ukuran sedang\n2 sdt garam\n1/2 sdt merica bubuk\n1 sdt air jeruk nipis\n75 ram tepung baizena\nminyak goreng secukupnya untuk menggoreng\n\n Bahan Untuk Saus :\n\n2 sdm margarin\n1 siung bawang putih, cincang\n1 buah cabai merah, (buang biji dan bentuk menyerupai korek api)\n1 ruas jari jahe, dimemarkan\n75 gr saus tomat\n1 sdt kecap inggris\n1 sdt garam\n1/4 sdt merica bubuk\n3/4 sdt gula pasir\n250 ml air\n2 sdt tepung sagu (dilarutkan dalam 2 sdm air )\n1 Buah daun bawang, diiris\n1/2 sdt air jeruk nipis","900 gram gurame fillet, potong dadu\n1 sendok teh garam\n1 sendok teh air jeruk lemon\n1 sendok teh tepung sagu\n1 sendok teh tepung beras\n3 siung bawang putih, cincang halus\n2 buah cabai merah besar, diiris serong\n100 gram wortel, potong korek api\n3 buah tomat, direbus, haluskan\n3 sendok makan makan saus tomat\nsendok teh kecap inggrisn\n1 sendok teh garam\n2 sendok makan gula pasir\n200 ml air\n1 sendok teh tepung sagu, larutkan\n1 buah Bawang Bombay\nkacang polong secukupnya\n\n Bahan Pelapis :\n\n8 sendok makan tepung terigu\n2 butir telur ayam (putihnya saja)\n\n Bahan Pelengkap :\n\nNanas secukupnya\nMentimun secukupnya"};
    String [] cara={"1. Lumuri ikan gurame yang sudah dibersihkan dengan campuran tepung kanji dan garam. Masukkan minyak secukupnya ke dalam wajan yang besar supaya seluruh ikan bisa masuk.\n2. Kemudian goreng dalam minyak panas yang cukup banyaknya agar ikan tergenang dan tidak lengket di wajan.\n3. Angkat ikan apabila warnanya berubah menjadi kekuning-kuningan dan dagingnya sudah matang.\n\n Cara Membuat Saus : \n\n1. Seduh tomat dengan air medidih lalu diamkan sampai kulit tomat menjadi lunak. Hancurkan tomat lalu disaring dan buang ampasnya. Campur air tomat dengan 150 cc air.\n2. Di dalam wajan panaskan margarine, tumis bawang merah, bawang putih, cabe merah dan jahe sampai harum lalu masukkan lokio dan air tomat. Masukkan gula, cuka dan bumbu penyedap. Tuangkan saus tomat dan masukkan cairan tepung kanji. Masak sampai mendidih dan mengental lalu diangkat.\n3. Hidangkan ikan gurame goreng dengan menuangkan saus ke atasnya","1. Yang pertama dilakukan adalah mencuci bersih ikan gurame kemudian lumuri dengan perasan air jeruk, lalu diamkan sekitar 10 menit.\n2. Selanjutnya adalah panaskan minyak goreng secukupnya kemudian tumis bahan bumbu yang sudah dihaluskan, lalu tambahkan daun salam, daun sereh dan juga daun jeruk.\n3. Kemudian masukan ikan gurame, lalu belimbing wuluh, lalu tambahkan pula cabe merah dan cabe ijo yang sudah dipotong-potong, dan juga tambahkan bawang merah yang sudah diiris, lalu garam, gula, aduk-aduk, lalu masak hingga matang\n4. Selanjutnya adalah masukan daun kemangi agar gulai ikan gurame mengeluarkan wangi harum yang sedap.\n5. Angkat dan siap disajikan.","1. Buang sisik dan isi perut ikan dan biarkan utuh. Buat 2-3 irisan di setiap sisi badan ikan.\n2. Lumuri ikan gurame dengan garam dan merica secukupnya dan biarkan kurang lebih 30 menit supaya bumbu meresap.\n3. Bakar ikan gurame tersebut di atas bara api yang kecil sampai setengah matang. Jangan lupa dibolak balik. Angkat.\n4. Lalu buatkan bumbunya: haluskan bawang merah, bawang putih, cabai rawit, kemiri, kunyit, garam dan merica. Campur irisan tomat dan aduk sampai merata.\n5. Lumuri ikan gurame dengan bumbu ini hingga merata di ke dua belah sisi ikan gurame setengah matang tadi. Lalu bakar kembali di atas bara api sedang sampai matang dan sesekali diolesi dengan sisa bumbunya.\n6. Hidangkan ikan gurame bakar dengan taburan irisan cabai merah, irisan tomat dan jeruk nipis atau lemon.","1. Yang pertama dilakukan adalah ikan guirame di belah kedua sisinya dari bagian ekor hingga ke kepala (tidak putus\n2. Setelah itu cuci hingga bersih, kemudian lumuri dengan jeruk nipis, garam dan juga merica bubuk, kemduian diamkan sekitar 15 menit.\n3. Setelah itu ikan gurame gulingkan pada tepung maizena.\n4. Selanjutnya adalah ikan gurame bagian tulangnya di jepit menggunakan penjepit, lalu goreng sambil dijepit hingga matang, angkat dan tiriskan.\n5. Kemudian membuat bumbu saus, yaitu panaskan margarine kemudian tumis cabai merah, bawang putih serta jahe hingga harum.\n6. Setelah itu tambahkan nanas, kecap inggris, saus tomat, merica bubuk, garam serta gula pasir, kemudian aduk hingga.\n7. Setelah itu tamnbahkan air kaldu, masak hingga mendidih, lalu kentalkan dengan menggunakan larutan tepung sagu, kemudian aduk-aduk hingga nantinya meletup-letup, selanjutnya tambahkan daun bawang, lalu kacang polong serta air jeruk nipis, lalu aduk-aduk hingga klayu, kemudian angkat.\n8. Ikan gurame terbang siap disajikan bersama dengan sausnya.","1. Yang pertama dilakukan adalah ikan gurame dicuci hingga bersih, kemudian lumuri dengan menggunakan air jeruk lemon dan juga garam, fungsinya adalah untuk menghilangkan bau amis pada ikan gurame, setelah itu diamkan sekitar 10-15 menit\n2. Selanjutnya buat bahan pelapis seperti putih telur dan juga tepung terigu aduk hingga rata.\n3. Selanjutnya celupkan ikan guramne pada bahan pelapis.\n4. Kemudian panaskan minyak goreng secukupnya kemudian goreng ikan gurame hingga matang, dengan menggunakan api sedang, lalu angkat dan sisihkan.\n5. Sekarang membuat saus, yang pertama dilakukan adalah menumis bawang putih, bawang Bombay, dan juga cabai merah hingga harum, lalu tambahkan wortel, aduk-aduk hingga layu wortelnya. Kemudian tambahkan tomat lalu aduk hingga layu pula, setelah itu bubuhi dengan saus tomat, kecap inggris, lalu aduk hingga rata.\n6. Selanjutnya tambahkan air, garam, kacang polong dan juga gula pasir, diamkan masak hingga mendidih dan juga matang (sekali-kali diaduk). Selanjutnya kentalkan menggunakan larutan tepung sagu, aduk hingga mendidih (meletup-letup), lalu tambahkan bahan pelengkap berupa nanas yang sudah diiris dan juga mentimun yang diiris.\n7. Ikan gurame asam manis siap disajikan bersama dengan sausnya."};
    String [] deskripsi={"Gurame asem manis dengan rasa yang khas dan membuat anda ketagihan bila mencobanya","Gurame gulai dengan kuahnya yang kental membuat kelezatan tersendiri","Gurame bakar adalah menu yang sangan lezat dengan bumbu bakar yang spesial membuat ikan makin istimewa","Gurame terbang dengan tampilannya yang menyerupai burung membuat tampilannya semaking enak di pandang dan juga tentu rasanya yang akan seperti terbang jika memakannya","Gurame tepung asam manis dengan asam manisnya yang lezat di tambah tepung sudah jelas bahwa rasanya akan sangat istimewa"};

    Integer[] gambar={R.drawable.asemmanis,R.drawable.gulai,R.drawable.guramebakar,R.drawable.gurameterbang,R.drawable.tepungasammanis};
    LayoutInflater inflater;
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name

    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.itemdetil, parent, false);

        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.tv2.setText(deskripsi[position]);
        holder.tv2.setOnClickListener(clickListener);
        holder.imageView.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.tv2.setTag(holder);
        holder.imageView.setTag(holder);
        holder.imageView.setImageResource(gambar[position]);


    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();

            int position = vholder.getPosition();

            Bundle b = new Bundle();


            b.putInt("gambar",gambar[position]);
            b.putString("label","Resep "+name[position]);
            b.putString("bahan",bahan[position]);
            b.putString("cara",cara[position]);

            Intent intent = new Intent(context , TampilDetail.class);
            intent.putExtras(b);
            context.startActivity(intent);




        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }

}
