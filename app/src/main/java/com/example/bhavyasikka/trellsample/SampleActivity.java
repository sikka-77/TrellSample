package com.example.bhavyasikka.trellsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class SampleActivity extends AppCompatActivity {

    List<General> listnew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        listnew = new ArrayList<>();
        for(int i=0;i<200;i++)
        {
            if(i%2==0)
                listnew.add(new General("Image even Image even Image even" +
                        " Image even Image even" +
                        "Image even Image even Image even ",R.drawable.trell));
            else
                listnew.add(new General("Image odd",R.drawable.cart));
        }

        /*setting the adapter*/

        RecyclerView newrec=(RecyclerView) findViewById(R.id.recycleView);
        GeneralAdapter newadap= new GeneralAdapter(this,listnew);
        newrec.setLayoutManager(new StaggeredGridLayoutManager(2,1));
        newrec.setAdapter(newadap);
    }
}
