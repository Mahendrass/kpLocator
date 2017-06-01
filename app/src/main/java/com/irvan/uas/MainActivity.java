package com.irvan.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.lv_listTempat);

        final ArrayList<Kerja_praktek> data = new ArrayList<>();
        data.add(new Kerja_praktek(R.drawable.cb3,"Mitrais","gg mina"));
        data.add(new Kerja_praktek(R.drawable.ga3,"TimeDoor","Tukad Citarum"));
        data.add(new Kerja_praktek(R.drawable.lv2,"CreativaBali","Batubulan"));
        data.add(new Kerja_praktek(R.drawable.lv4,"MaxSolution","Teuku Umar"));

        Kerja_praktek_adapter adapter= new Kerja_praktek_adapter(this, R.layout.list_item_kp,data);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Kerja_praktek KerjaPraktek = data.get(position);
                Intent toActivity = new Intent(getApplicationContext(),Detail_KP_Activity.class);
                toActivity.putExtra("gambar", KerjaPraktek.gambar);
                toActivity.putExtra("judul", KerjaPraktek.judul);
                toActivity.putExtra("alamat", KerjaPraktek.alamat);
                startActivity(toActivity);


            }
        });
    }
}
