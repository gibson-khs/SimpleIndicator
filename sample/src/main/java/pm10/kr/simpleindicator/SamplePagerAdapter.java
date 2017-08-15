package pm10.kr.simpleindicator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SamplePagerAdapter extends FragmentPagerAdapter {

    private final int ITEM_COUNT = 5;

    public SamplePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return SampleFragment.getInstance(position);
    }

    @Override
    public int getCount() {
        return ITEM_COUNT;
    }
}
