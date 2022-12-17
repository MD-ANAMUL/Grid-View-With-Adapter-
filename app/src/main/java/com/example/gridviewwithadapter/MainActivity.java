package com.example.gridviewwithadapter;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView gridViewS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int[] allGridImage = {
                R.drawable.image,
                R.drawable.image1,
                R.drawable.image5,
                R.drawable.image2,
                R.drawable.image3,
                R.drawable.image,
                R.drawable.image1,
                R.drawable.image5,
                R.drawable.image2,
                R.drawable.image3,
        };

        String[] allItemsName ={
                "ItemOne","ItemTwo",
                "ItemThree","ItemFour",
                "ItemFive","ItemSix",
                "ItemSeven","ItemEight",
                "ItemNine","ItemTen"
        };


        gridViewS = findViewById(R.id.grid_main_container);
        AdapterForGrid adapterForGrid = new AdapterForGrid(MainActivity.this, allGridImage,allItemsName);
        gridViewS.setAdapter(adapterForGrid);


    }
}