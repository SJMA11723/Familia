package com.sjma11723.familia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewFamilia;
    ArrayList<String> nombres, estados;
    private int images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewFamilia = (ListView) findViewById(R.id.listViewFamilia);

        nombres = new ArrayList<String>();
        nombres.add("Gabriel");

        estados = new ArrayList<String>();
        estados.add("Disponible");

        images = R.mipmap.ic_gabriel;

        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_item, nombres, estados, images);
        listViewFamilia.setAdapter(myAdapter);
    }
}
