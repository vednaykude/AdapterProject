package com.example.adapterproject;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Pokemon> {

    private final MainActivity mainActivity;
    Context mainContext;
    List<Pokemon> mylist;

    public CustomAdapter(MainActivity mainActivity, @NonNull Context context, int resource, @NonNull List<Pokemon> objects) {
        super(context, resource, objects);
        this.mainActivity = mainActivity;
        mainContext = context;
        mylist = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) mainContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.adapter_custom, null);
        final TextView textView = view.findViewById(R.id.adapterText);
        final int a = position;
        mainActivity.button = view.findViewById(R.id.adapterButton);
        mainActivity.t3 = view.findViewById(R.id.adapterText2);
        mainActivity.t3.setText(mylist.get(position).getName());
        //button.setText(mylist.get(position));
        mainActivity.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int o = mainActivity.getResources().getConfiguration().orientation;
                if (a == 0) {
                    String b = mainActivity.list.get(a).getName();
                    mainActivity.list.remove(a);
                    notifyDataSetChanged();
                    if (o == Configuration.ORIENTATION_LANDSCAPE) {
                        mainActivity.imageView.setImageResource(R.drawable.pokeball);
                        mainActivity.t2.setText("Pokemon (" + b + ") Deleted!");
                        mainActivity.posOfSelected = -1;
                    } else {
                        mainActivity.t.setText("Pokemon (" + b + ") Deleted!");
                        mainActivity.posOfSelected = -1;
                    }
                }
                if (a == 1) {
                    String c = mainActivity.list.get(a).getName();
                    mainActivity.list.remove(a);
                    notifyDataSetChanged();
                    if (o == Configuration.ORIENTATION_LANDSCAPE) {
                        mainActivity.imageView.setImageResource(R.drawable.pokeball);
                        mainActivity.t2.setText("Pokemon (" + c + ") Deleted!");
                        mainActivity.posOfSelected = -1;
                    } else {
                        mainActivity.t.setText("Pokemon (" + c + ") Deleted!");
                        mainActivity.posOfSelected = -1;
                    }
                }
                if (a == 2) {
                    String d = mainActivity.list.get(a).getName();
                    mainActivity.list.remove(a);
                    notifyDataSetChanged();
                    if (o == Configuration.ORIENTATION_LANDSCAPE) {
                        mainActivity.imageView.setImageResource(R.drawable.pokeball);
                        mainActivity.t2.setText("Pokemon (" + d + ") Deleted!");
                        mainActivity.posOfSelected = -1;
                    } else {
                        mainActivity.t.setText("Pokemon (" + d + ") Deleted!");
                        mainActivity.posOfSelected = -1;
                    }
                }
                if (a == 3) {
                    String e = mainActivity.list.get(a).getName();
                    mainActivity.list.remove(a);
                    notifyDataSetChanged();
                    if (o == Configuration.ORIENTATION_LANDSCAPE) {
                        mainActivity.imageView.setImageResource(R.drawable.pokeball);
                        mainActivity.t2.setText("Pokemon (" + e + ") Deleted!");
                        mainActivity.posOfSelected = -1;
                    } else {
                        mainActivity.t.setText("Pokemon (" + e + ") Deleted!");
                        mainActivity.posOfSelected = -1;
                    }
                }
                if (a == 4) {
                    String f = mainActivity.list.get(a).getName();
                    mainActivity.list.remove(a);
                    notifyDataSetChanged();
                    if (o == Configuration.ORIENTATION_LANDSCAPE) {
                        mainActivity.imageView.setImageResource(R.drawable.pokeball);
                        mainActivity.t2.setText("Pokemon (" + f + ") Deleted!");
                        mainActivity.posOfSelected = -1;
                    } else {
                        mainActivity.t.setText("Pokemon (" + f + ") Deleted!");
                        mainActivity.posOfSelected = -1;
                    }
                }
                if (a == 5) {
                    String g = mainActivity.list.get(a).getName();
                    mainActivity.list.remove(a);
                    notifyDataSetChanged();
                    if (o == Configuration.ORIENTATION_LANDSCAPE) {
                        mainActivity.imageView.setImageResource(R.drawable.pokeball);
                        mainActivity.t2.setText("Pokemon (" + g + ") Deleted!");
                        mainActivity.posOfSelected = -1;
                    } else {
                        mainActivity.t.setText("Pokemon (" + g + ") Deleted!");
                        mainActivity.posOfSelected = -1;
                    }
                }
            }
        });
        return view;

    }


}
