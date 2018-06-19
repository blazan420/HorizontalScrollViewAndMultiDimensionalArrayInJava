package com.example.kevin.horizontalscrollviewandmultidimensionalarrayinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtIntArray1 = (TextView)findViewById(R.id.txtArray1);
        TextView txtIntArray2 = (TextView)findViewById(R.id.txtArray2);

        //Create an Array of Arrays
        int[][] intArray1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}, {16, 17, 18},
        {19, 20, 21}, {22, 23, 24}};






    }
}
