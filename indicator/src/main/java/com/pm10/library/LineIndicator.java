package com.pm10.library;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class LineIndicator extends IndicatorBase {

    public LineIndicator(Context context) {
        super(context);
    }

    public LineIndicator(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected IndicatorType getType() {
        return IndicatorType.LINE;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint defaultPaint = getStrokePaint(defaultColor);
        defaultPaint.setStrokeWidth(lineHeight);

        Paint selectedPaint = getStrokePaint(selectedColor);
        selectedPaint.setStrokeWidth(lineHeight);

        Paint strokePaint = getStrokePaint(strokeColor);
        strokePaint.setStrokeWidth(strokeWidth);


        if (itemCount <= 0)
            return;

        Rect rect = canvas.getClipBounds();
        float y = rect.centerY();
        float startX = strokeWidth;
        float stopX = lineWidth;

        for (int i = 0; i < itemCount; i++) {
            canvas.drawLine(startX, y, stopX, y, i == selectPosition ? selectedPaint : defaultPaint);
            if (0 < strokeWidth)
                canvas.drawRect(startX, 0, stopX, getHeight(), strokePaint);
            startX = stopX + gap;
            stopX = startX + lineWidth;
        }

    }


}
