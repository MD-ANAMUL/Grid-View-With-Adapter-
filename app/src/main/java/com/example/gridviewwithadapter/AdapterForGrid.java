package com.example.gridviewwithadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterForGrid extends BaseAdapter {

    Context context;
    int[] girdImages;
    String[] allItemsNames;

    public AdapterForGrid(Context context, int[] girdImages,String[] allItemsNames) {
        this.context = context;
        this.girdImages = girdImages;
        this.allItemsNames = allItemsNames;
    }

    @Override
    public int getCount() {
        return allItemsNames.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.sample_grid_design, viewGroup, false);
        }

        ImageView imageView = view.findViewById(R.id.sample_image_view);
        imageView.setImageResource(girdImages[i]);
        TextView textView = view.findViewById(R.id.sample_text_grid_view);
        textView.setText(allItemsNames[i]);

        return view;
    }
}
