package pm10.kr.library;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class IndicatorBase extends View {

    protected Context context;
    protected int itemCount;
    protected int selectPosition;
    protected int gap;
    protected int defaultColor;
    protected int selectedColor;
    protected int strokeColor;

    protected int radius;
    protected int strokeWidth;

    public IndicatorBase(Context context) {
        super(context);
    }

    public IndicatorBase(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void setupWithViewPager(ViewPager pager) {
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                selectPosition = position;
                invalidate();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        itemCount = pager.getAdapter().getCount();

        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = (((radius * 2) + gap) * itemCount - gap) + (strokeWidth * 2);
        layoutParams.height = radius * 2 + +(strokeWidth * 2);
        setLayoutParams(layoutParams);
        invalidate();
    }
}
