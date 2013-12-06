package com.advies;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

//import com.googlecode.charts4j.Color;
//import com.googlecode.charts4j.GCharts;
//import com.googlecode.charts4j.PieChart;
//import com.googlecode.charts4j.Slice;

public class ResultsActivity extends Activity {

    private static int SINGLE = 1;
    private static int MULTIPLE = 2;

    private int type = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(type == SINGLE) {
//            Slice s1 = Slice.newSlice(30, Color.newColor("CACACA"), "Safari", "Apple");
//            Slice s2 = Slice.newSlice(30, Color.newColor("DF7417"), "Firefox", "Mozilla");
//            Slice s3 = Slice.newSlice(30, Color.newColor("951800"), "Chrome", "Google");
//            Slice s4 = Slice.newSlice(10, Color.newColor("01A1DB"), "Internet Explorer", "Microsoft");
//
//            PieChart chart = GCharts.newPieChart(s1, s2, s3, s4);
//            chart.setTitle("A Better Web", Color.BLACK, 16);
//            chart.setSize(500, 200);
//            chart.setThreeD(true);

            setContentView(R.layout.activity_results_single);
        }
        else
            setContentView(R.layout.activity_results_multiple);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.results, menu);
        return true;
    }
    
}
