package com.logistics.alucard.tablayoutsviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements MyInterface {

    private static final String TAG = "MainActivity";

    Toolbar toolbar;

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter adapter;

    static String myMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.appToolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true); //set auto back button

        viewPager = findViewById(R.id.appViewPager);
        tabLayout = findViewById(R.id.appTabLayout);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void sendData(String data) {
        //Tab6 tab6 = (Tab6) getSupportFragmentManager().findFragmentById(R.id.fragment6);
        Log.d(TAG, "sendData: data: " + data);
        myMessage = data;

    }

    public static String activityData() {
        return myMessage;
    }
}
