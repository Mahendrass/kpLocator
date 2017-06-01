package com.irvan.uas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_KP_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__kp_);

        ImageView iv_gambar = (ImageView) findViewById(R.id.iv_detailGambar);
        TextView tv_judul = (TextView) findViewById((R.id.tv_detailJudul));
        TextView tv_alamat = (TextView) findViewById(R.id.tv_detailJudul);
        TextView tv_konsentrasi = (TextView) findViewById(R.id.tv_konsentrasi);
        TextView tv_syarat = (TextView) findViewById(R.id.tv_syaratKp);
        TextView tv_lamaKp = (TextView) findViewById(R.id.tv_lamaKp);

        String judul = getIntent().getExtras().getString("judul");
        int gambar = getIntent().getExtras().getInt("gambar");
        String alamat = getIntent().getExtras().getString("alamat");

        iv_gambar.setImageResource(gambar);
        tv_judul.setText(judul);
        tv_alamat.setText(alamat);

        if(judul.equals("Mitrais")){
            tv_konsentrasi.setText("Teknik Komputer Cerdas Dan BioInformatika");
            tv_syarat.setText("- CV (English)\n - KHS (Semester terbaru) \n - Surat Rekomendasi dari Fakultas \n - Test Toefl");
            tv_lamaKp.setText("2 Bulan");
        }else if (judul.equals("TimeDoor")){
            tv_konsentrasi.setText("Teknik Komputer Cerdas Dan BioInformatika");
            tv_syarat.setText("- CV (English)\n - Test (Web Programming)");
            tv_lamaKp.setText("3 Bulan");
        }else if (judul.equals("CreativaBali")){
            tv_konsentrasi.setText("Teknik Komputer Cerdas Dan BioInformatika");
            tv_syarat.setText("- CV ");
            tv_lamaKp.setText("1 Bulan / 2 Bulan / 3 Bulan");
        }

    }
}
