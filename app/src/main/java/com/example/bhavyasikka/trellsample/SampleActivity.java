package com.example.bhavyasikka.trellsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;

import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;

import java.util.ArrayList;
import java.util.List;

public class SampleActivity extends AppCompatActivity {

    List<General> listnew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listnew = new ArrayList<>();
        for(int i=0;i<400;i++)
        {
            if(i%2==0)
                listnew.add(new General("Image "));
                        //,R.drawable.trell));
            else if(i%3==0)
                listnew.add(new General("Image odd"));
            else
                listnew.add(new General("End"));
                        //,R.drawable.trell));
        }

        /*setting the adapter for */

        RecyclerView newrec=(RecyclerView) findViewById(R.id.recycleView2);
        FlexboxLayoutManager layoutManager=new FlexboxLayoutManager(this);
        layoutManager.setFlexDirection(FlexDirection.ROW);
        layoutManager.setFlexWrap(FlexWrap.WRAP);
        //layoutManager.setJustifyContent(JustifyContent.FLEX_START);
        layoutManager.setAlignItems(AlignItems.STRETCH);
        newrec.setLayoutManager(layoutManager);
        GeneralAdapter newadap= new GeneralAdapter(this,listnew);
        //newrec.setLayoutManager(new StaggeredGridLayoutManager(2,1));
        newrec.setAdapter(newadap);
    }
}
