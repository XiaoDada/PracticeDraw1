package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.Paint;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        int midWidth = getWidth() / 2;
        int midHeight = getHeight() / 2;

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Path path = new Path();
        paint.setColor(Color.parseColor("#123456"));

        paint.setStyle(Paint.Style.FILL);
//        path.addCircle(300, 300, 200, Path.Direction.CW);
//        path.lineTo(100, 100);
//        path.lineTo(600,100);
//        path.rLineTo(100,100);
//        path.quadTo(100,100,500,700);
//        path.cubicTo(100,100,700,200,200,800);
//        path.moveTo(200,200);
//        path.lineTo(200, 400);
//        path.rLineTo(0, 400);
//        canvas.drawPath(path, paint);
//        path.addArc(200, 200, 400, 400, -225, 225);
//        path.arcTo(400, 200, 600, 400, -180, 225, false);
//        path.lineTo(400, 542);
//        path.close();

//        path.addArc(100,100,300,300,-190,185);
//        path.arcTo(300,100,500,300,-180,190,true);
//        path.moveTo(100, 100);
//        path.lineTo(300, 400);
//
//        path.close();
//        canvas.drawPath(path,paint);
        path.arcTo(200, 200, 400, 400, -225, 225,false);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);
        path.close();
        canvas.drawPath(path,paint);

    }
}
