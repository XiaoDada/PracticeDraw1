package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        //1.实心圆
        Paint paint=new Paint();
        paint.setAntiAlias(true);
        canvas.drawCircle(200,200,100,paint);
        //2.空心圆
        Paint paint2=new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(500,200,100,paint2);
        //3.蓝色实心圆
        Paint paint3=new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(Color.parseColor("#EEE333"));
        canvas.drawCircle(200,500,100,paint3);
        //4.线宽为 20 的空心圆

        Paint paint4=new Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(Color.parseColor("#EEE333"));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(20);
        canvas.drawCircle(500,500,100,paint4);

    }
}
