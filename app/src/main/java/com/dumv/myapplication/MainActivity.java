package com.dumv.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.jetradarmobile.snowfall.SnowfallView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<RelativeLayout> arr = new ArrayList<>();
    ArrayList<Integer> arrID = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arr.add((RelativeLayout) (findViewById(R.id.hu1)));
        arrID.add(R.id.btn1);
        arr.add((RelativeLayout) (findViewById(R.id.hu2)));
        arrID.add(R.id.btn2);
        arr.add((RelativeLayout) (findViewById(R.id.hu3)));
        arrID.add(R.id.btn3);
        arr.add((RelativeLayout) (findViewById(R.id.hu4)));
        arrID.add(R.id.btn4);
        arr.add((RelativeLayout) (findViewById(R.id.hu5)));
        arrID.add(R.id.btn5);
        arr.add((RelativeLayout) (findViewById(R.id.hu6)));
        arrID.add(R.id.btn6);
        arr.add((RelativeLayout) (findViewById(R.id.hu7)));
        arrID.add(R.id.btn7);


        show(0);
    }

    public void show(int i) {
        for (RelativeLayout s : arr) {
            s.setVisibility(View.GONE);
        }
        arr.get(i).setVisibility(View.VISIBLE);
    }

    public void shows(View view) {
        int ix = -1;
        for (Integer i : arrID) {
            ix++;
            if (i == view.getId()) {
                show(ix);
                break;
            }
        }
    }
}
