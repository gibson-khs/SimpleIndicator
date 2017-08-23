package com.pm10.simpleindicator;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.pm10.library.CircleIndicator;
import com.pm10.library.LineIndicator;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new SamplePagerAdapter(getSupportFragmentManager()));

        LineIndicator lineIndicator = (LineIndicator) findViewById(R.id.line_indicator);
        lineIndicator.setupWithViewPager(viewPager);

        CircleIndicator circleIndicator = (CircleIndicator) findViewById(R.id.circle_indicator);
        circleIndicator.setupWithViewPager(viewPager);
    }
}
