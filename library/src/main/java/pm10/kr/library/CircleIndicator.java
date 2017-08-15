package pm10.kr.library;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import pm10.kr.library.utils.PixelUtils;

public class CircleIndicator extends IndicatorBase {


    public CircleIndicator(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public CircleIndicator(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    private void init() {
        defaultColor = context.getResources().getColor(R.color.white);
        selectedColor = context.getResources().getColor(R.color.gray);
        strokeColor = context.getResources().getColor(R.color.gray);
        radius = (int) PixelUtils.dpToPx(context, 4);
        strokeWidth = (int) PixelUtils.dpToPx(context, 1);
        gap = radius * 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint defaultPaint = new Paint();
        defaultPaint.setColor(defaultColor);
        defaultPaint.setAntiAlias(true);
        defaultPaint.setStyle(Paint.Style.FILL);

        Paint selectedPaint = new Paint();
        selectedPaint.setColor(selectedColor);
        selectedPaint.setAntiAlias(true);
        selectedPaint.setStyle(Paint.Style.FILL);

        Paint strokePaint = new Paint();
        strokePaint.setColor(strokeColor);
        strokePaint.setAntiAlias(true);
        strokePaint.setStyle(Paint.Style.STROKE);

        if (itemCount <= 0)
            return;

        Rect rect = canvas.getClipBounds();
        float y = rect.centerY();
        float x = radius + strokeWidth;

        for (int i = 0; i < itemCount; i++) {
            canvas.drawCircle(x, y, radius, i == selectPosition ? selectedPaint : defaultPaint);
            canvas.drawCircle(x, y, radius, strokePaint);
            x = x + radius + gap + radius;
        }

    }


}