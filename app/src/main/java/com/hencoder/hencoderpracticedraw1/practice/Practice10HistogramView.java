package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private static final int IMAGE_WIDTH = 900;
    private static final int IMAGE_HEIGHT = 500;
    private static final int START_X = 100;
    private static final int START_Y = 100;
    private static final int INTERVAL = 30;//两个矩形之间的间隔
    private Paint paint;
    private static final String[] TEXTS = {"liu", "ran", "love", "you", "feng", "da", "yiqi"};
    private static final int[] HEIGHTS = {20, 50, 80, 120, 300, 300, 500};
    private static final String[] COlORS = {"#FF4081", "#FF96FF40", "#FF40FFEF", "#FF9640FF", "#FFECFF40", "#FF40FFEF", "#FF96FF40"};
    private static final int COLUMN_WIDTH = (IMAGE_WIDTH - (TEXTS.length + 1) * INTERVAL) / TEXTS.length;//当个矩形的底部宽度

    {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor(COlORS[2]));
        paint.setStyle(Paint.Style.FILL);
    }

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        canvas.drawLine(START_X, START_Y, START_X, START_Y + IMAGE_HEIGHT, paint);
        canvas.drawLine(START_X, START_Y + IMAGE_HEIGHT, START_X + IMAGE_WIDTH, START_Y + IMAGE_HEIGHT, paint);

        //坐标轴底部文字
        paint.setTextSize(30);
        paint.setColor(Color.parseColor("#FF8960"));
        for (int i = 0; i < TEXTS.length; i++) {
            canvas.drawText(TEXTS[i],
                    START_X + (i + 1) * INTERVAL + i * COLUMN_WIDTH + COLUMN_WIDTH / 2 - paint.measureText(TEXTS[i]) / 2,
                    START_Y + IMAGE_HEIGHT + 30,
                    paint);
        }

        //底部文字
        paint.setTextSize(50);
        canvas.drawText("直方图", START_X + (IMAGE_WIDTH / 2) - 50, START_Y + IMAGE_HEIGHT + 150, paint);

        //柱状图
//        paint.setColor(Color.GREEN);
        Path path = new Path();
        path.moveTo(START_X + INTERVAL, START_Y + IMAGE_HEIGHT - HEIGHTS[0]);
        for (int i = 0; i < HEIGHTS.length; i++) {
            paint.setColor(Color.parseColor(COlORS[i]));
            path.addRect(START_X + (i + 1) * INTERVAL + i * COLUMN_WIDTH,
                    START_Y + IMAGE_HEIGHT - HEIGHTS[i],
                    START_X + (i + 1) * (INTERVAL + COLUMN_WIDTH),
                    START_Y + IMAGE_HEIGHT,
                    Path.Direction.CW);
        }
        canvas.drawPath(path, paint);


    }
}
