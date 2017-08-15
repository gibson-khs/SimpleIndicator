package pm10.kr.simpleindicator;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pm10.kr.library.CircleIndicator;

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

        CircleIndicator circleIndicator = (CircleIndicator) findViewById(R.id.indicator);
        circleIndicator.setupWithViewPager(viewPager);
    }
}
