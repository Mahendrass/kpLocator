package com.irvan.uas;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Irvan on 01-Jun-17.
 */

public class Kerja_praktek_adapter extends ArrayAdapter<Kerja_praktek> {
    Context context;
    int layoutResourceID;
    ArrayList<Kerja_praktek> data = null;

    public Kerja_praktek_adapter(Context context, int resource, ArrayList<Kerja_praktek> objects){
        super(context, resource, objects);
        this.context = context;
        this.layoutResourceID = resource;
        this.data = objects;
    }
    static class KerjaPraktekHolder{
        //ImageView iconAlamat;
        ImageView img;
        TextView judul;
        TextView alamat;
        TextView desc;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        View row = convertView;
        KerjaPraktekHolder holder = null;

        if(row == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceID,parent,false);

            holder = new KerjaPraktekHolder();
            holder.img= (ImageView) row.findViewById(R.id.iv_gambar);
            //holder.iconAlamat = (ImageView) row.findViewById(R.id.iv_imgAlamat);
            holder.judul = (TextView) row.findViewById(R.id.tv_judul);
            holder.alamat= (TextView) row.findViewById(R.id.tv_alamat);

            row.setTag(holder);
        } else{
            holder = (KerjaPraktekHolder) row.getTag();
        }
        Kerja_praktek KerjaPraktek = data.get(position);
        holder.img.setImageResource(KerjaPraktek.gambar);
        holder.judul.setText(KerjaPraktek.judul);
//        holder.imgAlamat.setImageResource(KerjaPraktek.iconAlamat);
        holder.alamat.setText(KerjaPraktek.alamat);

        return row;
    }
}
