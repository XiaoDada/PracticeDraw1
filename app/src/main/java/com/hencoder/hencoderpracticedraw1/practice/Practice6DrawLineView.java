package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice6DrawLineView extends View {

    public Practice6DrawLineView(Context context) {
        super(context);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawLine() 方法画直线
        Paint paint=new Paint();
        paint.setColor(Color.parseColor("#EE8976"));
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5);
        float[] points={200,100,300,200,200,400,300,400,200,700,300,600,400,100,800,100,600,100,600,700,400,700,800,700};
        canvas.drawLines(points,paint);
//        canvas.drawLine(200,100,300,200,paint);
//        canvas.drawLine(200,400,300,400,paint);
//        canvas.drawLine(200,700,300,600,paint);
//
//        canvas.drawLine(400,100,800,100,paint);
//        canvas.drawLine(600,100,600,700,paint);
//        canvas.drawLine(400,700,800,700,paint);

    }
}
