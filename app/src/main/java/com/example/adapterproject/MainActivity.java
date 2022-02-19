package com.example.adapterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putSerializable("key",list);
        outState.putInt("key2", posOfSelected);
    }

    @Override
    protected void onRestoreInstanceState(Bundle state){
        super.onRestoreInstanceState(state);
        list.clear();
        list.addAll((Collection<? extends Pokemon>) state.getSerializable("key"));
        listView.setAdapter(customAdapter);
        customAdapter.notifyDataSetChanged();
        posOfSelected = state.getInt("key2");
        int o = getResources().getConfiguration().orientation;
            if (o == Configuration.ORIENTATION_LANDSCAPE && posOfSelected != -1) {
                imageView.setImageResource(list.get(posOfSelected).getPic());
                t2.setText(list.get(posOfSelected).getDescriptionactivity());
            }
            else if (o == Configuration.ORIENTATION_PORTRAIT && posOfSelected != -1){
                t.setText(list.get(posOfSelected).getDescriptionmain());
            }
    }

    ListView listView;
    ArrayList<Pokemon> list;
    TextView t;
    TextView t2;
    ImageView imageView;
    CustomAdapter customAdapter;
    Button button;
    TextView t3;
    int posOfSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        imageView = findViewById(R.id.imageView);
        final int orientation = getResources().getConfiguration().orientation;
        t = findViewById(R.id.textView2);
        t2 = findViewById(R.id.LtextView3);
        final Pokemon Char = new Pokemon("Charizard");
        final Pokemon Blas = new Pokemon("Blastoise");
        final Pokemon Vena = new Pokemon("Venusaur");
        final Pokemon Pika = new Pokemon("Pikachu");
        final Pokemon Shed = new Pokemon("Shedinja");
        final Pokemon Xurk = new Pokemon("Xurkitree");
        list = new ArrayList<>();
        list.add(Char);
        list.add(Blas);
        list.add(Vena);
        list.add(Pika);
        list.add(Shed);
        list.add(Xurk);

        customAdapter = new CustomAdapter(this, this, R.layout.adapter_custom, list);
        listView.setAdapter(customAdapter);
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(list.get(position).getName().equals("Charizard")) {
                    if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                        imageView.setImageResource(R.drawable.charizard);
                        t2.setText(Char.getDescriptionactivity());
                        posOfSelected = position;
                    }
                    else {
                        t.setText(Char.getDescriptionmain());
                        posOfSelected = position;
                    }
                }
                if(list.get(position).getName().equals("Blastoise")) {
                    if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                        imageView.setImageResource(R.drawable.blastoise);
                        t2.setText(Blas.getDescriptionactivity());
                        posOfSelected = position;
                    }
                    else {
                        t.setText(Blas.getDescriptionmain());
                        posOfSelected = position;
                    }
                }
                if(list.get(position).getName().equals("Venusaur")) {
                    if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                        imageView.setImageResource(R.drawable.venasaur);
                        t2.setText(Vena.getDescriptionactivity());
                        posOfSelected = position;
                    }
                    else {
                        t.setText(Vena.getDescriptionmain());
                        posOfSelected = position;
                    }
                }
                if(list.get(position).getName().equals("Pikachu")) {
                    if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                        imageView.setImageResource(R.drawable.pikachu);
                        t2.setText(Pika.getDescriptionactivity());
                        posOfSelected = position;
                    }
                    else {
                        t.setText(Pika.getDescriptionmain());
                        posOfSelected = position;
                    }
                }
                if(list.get(position).getName().equals("Shedinja")) {
                    if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                        imageView.setImageResource(R.drawable.shedinja);
                        t2.setText(Shed.getDescriptionactivity());
                        posOfSelected = position;
                    }
                    else {
                        t.setText(Shed.getDescriptionmain());
                        posOfSelected = position;
                    }
                }
                if(list.get(position).getName().equals("Xurkitree")) {
                    if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                        imageView.setImageResource(R.drawable.xurkitree);
                        t2.setText(Xurk.getDescriptionactivity());
                        posOfSelected = position;
                    }
                    else {
                        t.setText(Xurk.getDescriptionmain());
                        posOfSelected = position;
                    }
                }
            }
        });
    }

}