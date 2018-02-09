package com.sjma11723.familia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SJMA 11723 on 09/12/2017.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    ArrayList<String> nombres;
    ArrayList<String> estado;
    private int image;

    public MyAdapter (Context context, int layout, ArrayList<String> listaDeNombres, ArrayList<String> estados, int imageY){
        this.context = context;
        this.layout = layout;
        this.nombres = listaDeNombres;
        this.estado = estados;
        this.image = imageY;
    }
    @Override
    public int getCount() {
        return nombres.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        if(convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(this.layout, null);

            viewHolder = new ViewHolder();

            viewHolder.textViewName = (TextView) convertView.findViewById(R.id.textViewNombre);
            viewHolder.textViewEstado = (TextView) convertView.findViewById(R.id.textViewEstado);
            viewHolder.imagePerson = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        String currentName = nombres.get(position);
        viewHolder.textViewName.setText(currentName);

        String currentState = estado.get(position);
        viewHolder.textViewEstado.setText(currentState);

        int imageV = image;
        viewHolder.imagePerson.setImageResource(imageV);

        return convertView;
    }

    private static class ViewHolder{
        private TextView textViewName;
        private TextView textViewEstado;
        private ImageView imagePerson;
    }
}
