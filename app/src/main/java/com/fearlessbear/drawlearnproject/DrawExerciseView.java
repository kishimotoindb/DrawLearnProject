package com.fearlessbear.drawlearnproject;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * Created by BigFaceBear on 2018.01.30
 */

public class DrawExerciseView extends View {
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    final int SCREEN_WIDTH;
    final int SCREEN_HEIGHT;

    public DrawExerciseView(Context context) {
        this(context, null);
    }

    public DrawExerciseView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawExerciseView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        SCREEN_WIDTH = metrics.widthPixels;
        SCREEN_HEIGHT = metrics.heightPixels;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.clipRect(0, SCREEN_HEIGHT / 2, SCREEN_WIDTH, SCREEN_HEIGHT);
        mPaint.setColor(0xff007700);
        canvas.drawRect(0, 0, SCREEN_HEIGHT, SCREEN_WIDTH, mPaint);

    }
}

